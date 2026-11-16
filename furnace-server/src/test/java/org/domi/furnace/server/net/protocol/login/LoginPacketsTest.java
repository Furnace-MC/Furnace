// 로그인 패킷 read/write 라운드트립 + 오프라인 UUID 생성 검증
package org.domi.furnace.server.net.protocol.login;

import static org.junit.jupiter.api.Assertions.*;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import java.util.UUID;
import org.domi.furnace.server.net.io.Types;
import org.junit.jupiter.api.Test;

class LoginPacketsTest {

    @Test
    void loginStart_reads() {
        ByteBuf buf = Unpooled.buffer();
        Types.writeString(buf, "TestPlayer");
        UUID id = UUID.randomUUID();
        Types.writeUuid(buf, id);
        LoginStart p = LoginStart.read(buf);
        assertEquals("TestPlayer", p.name());
        assertEquals(id, p.uuid());
        buf.release();
    }

    @Test
    void loginSuccess_writes_idAndName() {
        UUID id = UUID.randomUUID();
        LoginSuccess p = new LoginSuccess(id, "TestPlayer");
        assertEquals(0x02, p.id());
        ByteBuf buf = Unpooled.buffer();
        p.write(buf);
        assertEquals(id, Types.readUuid(buf));
        assertEquals("TestPlayer", Types.readString(buf, 16));
        assertEquals(0, Types.readVarInt(buf));   // property count
        assertEquals(1, buf.readByte());          // strict error handling = true (바닐라 서버)
        buf.release();
    }

    @Test
    void offlineUuid_isDeterministic() {
        assertEquals(LoginStart.offlineUuid("TestPlayer"), LoginStart.offlineUuid("TestPlayer"));
        assertNotEquals(LoginStart.offlineUuid("a"), LoginStart.offlineUuid("b"));
    }
}
