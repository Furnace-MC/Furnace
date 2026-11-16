# Furnace

[한국어](#한국어) · [English](#english)

## 한국어

Furnace 는 Minecraft 1.21.1 서버입니다. 바닐라와 같은 결과를 내는 것을 목표로 하면서, 멀티스레드로 동작해 성능을 높입니다. 서버 본체와 함께 플러그인 API(`furnace-api`)와 Bukkit·Paper·Spigot 플러그인 호환 계층(`furnace-compat-paper`)을 제공합니다.

- **바닐라와 같은 동작**: 내부 구조는 자유롭게 바꾸되, 게임에서 관측되는 동작은 바닐라와 같게 합니다.
- **멀티스레드**: 월드 생성과 월드 처리를 여러 스레드로 나눕니다.
- **플러그인 호환**: 특정 플러그인이 아니라 일반적인 Bukkit·Paper·Spigot 플러그인을 지원하는 것을 목표로 합니다.
- **자체 플러그인 API**: `furnace-api` 로 플러그인을 만들 수 있습니다.

> 개발 중인 소스 저장소는 [Dominicus0830/Furnace](https://github.com/Dominicus0830/Furnace) 입니다.

### 플러그인 호환에 대한 안내

Bukkit·Paper·Spigot 플러그인 호환은 해당 개발팀 또는 권리자가 Furnace 에서의 사용을 금하면 언제든 중단될 수 있습니다. 사전 예고 없이 중단될 수 있으며, 중단된 플러그인은 호환 지원 목록에서 제외되고 계속 동작한다고 보장하지 않습니다. 이 정책은 특정 플러그인을 겨냥하지 않고 모든 호환 계층에 같이 적용됩니다.

### 라이선스

| 모듈 | 라이선스 |
|---|---|
| 서버 본체(`furnace-server`), `furnace-compat-paper`, 시험·도구 모듈 | GPL-3.0-only |
| `furnace-api` | MIT |

플러그인이 `furnace-api` 에만 의존하면 플러그인의 라이선스는 자유입니다. 바닐라 Mojang 서버·클라이언트에서 추출한 데이터와 Mojang 의 코드·자산은 이 저장소의 라이선스 대상이 아니며 Mojang 의 약관(EULA)을 따릅니다.

## English

Furnace is a Minecraft 1.21.1 server. It aims to produce the same results as vanilla while running multithreaded for better performance. Alongside the server it ships a plugin API (`furnace-api`) and a Bukkit/Paper/Spigot plugin compatibility layer (`furnace-compat-paper`).

- **Vanilla-identical behavior**: internals are free to differ, but behavior observable in game matches vanilla.
- **Multithreaded**: world generation and world processing are spread across multiple threads.
- **Plugin compatibility**: the goal is to support ordinary Bukkit, Paper, and Spigot plugins in general, not specific plugins.
- **Own plugin API**: build plugins against `furnace-api`.

> The in-development source repository is [Dominicus0830/Furnace](https://github.com/Dominicus0830/Furnace).

### Plugin compatibility notice

Compatibility with Bukkit, Paper, and Spigot plugins may be withdrawn at any time if a plugin's developer team or rights holder prohibits its use in Furnace. Support may end without prior notice; a plugin whose support has ended is removed from the compatibility list and is not guaranteed to keep working. This policy is not aimed at any particular plugin and applies to the whole compatibility layer.

### License

| Module | License |
|---|---|
| Server (`furnace-server`), `furnace-compat-paper`, test and tool modules | GPL-3.0-only |
| `furnace-api` | MIT |

A plugin that depends only on `furnace-api` may use any license. Data extracted from the vanilla Mojang server or client, and Mojang code and assets, are not covered by this repository's license and remain subject to Mojang's EULA.
