<div align="center">

# 🕶️ MyVuzixNavigationApp

**Vuzix Blade 2 스마트글라스 Android 앱 개발 기록**

Kotlin과 XML 기초부터, 스마트글라스에서 동작하는 내비게이션 앱까지.

![Android](https://img.shields.io/badge/Android-3DDC84?style=for-the-badge&logo=android&logoColor=white)
![Kotlin](https://img.shields.io/badge/Kotlin-7F52FF?style=for-the-badge&logo=kotlin&logoColor=white)
![XML](https://img.shields.io/badge/UI-XML%20Views-2563EB?style=for-the-badge)
![Vuzix](https://img.shields.io/badge/Device-Vuzix%20Blade%202-111827?style=for-the-badge)

![Status](https://img.shields.io/badge/Status-In%20Progress-F59E0B?style=flat-square)

[소개](#-프로젝트-소개) · [개발 타임라인](#-개발-타임라인) · [현재 진행 상황](#-현재-진행-상황) · [전체 계획](#-전체-계획)

</div>

---

## 💡 프로젝트 소개

안녕하세요. Vuzix Blade 2에서 직접 실행되는 Android 앱을 개발하고 있습니다.

이 프로젝트는 스마트글라스에서 방향과 거리를 확인할 수 있는 도보 내비게이션을 목표로 시작했습니다.

웹 개발 경험을 바탕으로 Kotlin, Android, XML을 학습하고 있습니다. 화면 구성과 입력 처리부터 시작해, 위치 정보와 2D 지도를 활용한 도보 내비게이션으로 확장하는 것을 목표로 합니다.

아직 개발 중이며, 현재는 터치패드로 방향과 거리를 바꾸는 HUD 화면을 만들었습니다. 이곳에 **개발 진행 상황과 완성까지의 계획**을 기록하고 있습니다.

## 🗓 개발 타임라인

| 날짜 | 진행 단계 | 작업 내용과 확인 결과 |
| --- | --- | --- |
| **2026.10.04** | 개발 환경 · 실기기 실행 | ADB로 Blade 2에 앱을 설치하고 `HELLO BLADE 2` 화면을 띄웠습니다. |
| **2026.10.04** | 터치패드 입력 | 터치패드 입력을 처리하고 실기기에서 동작을 확인했습니다. |
| **2026.10.07** | 위치 정보 테스트 준비 | 위치 권한·Provider 상태·좌표 표시를 위한 테스트 코드를 준비했습니다. 실제 위치 수신은 추가 검증이 필요합니다. |
| **2026.10.07** | 학습 진행 방식 정리 | Android·Kotlin·XML 기초를 익히며 기능을 하나씩 구현하는 방식으로 학습 방향을 정리했습니다. |
| **2026.11.10** | GitHub 연동 · HUD 코드 기록 | 방향·거리 HUD와 입력 처리 코드를 GitHub에 처음 업로드했습니다. |

## 📊 현재 진행 상황

**2026.11.11 기준**

**전체 10단계 중 3단계 완료 · 기초 학습과 위치 정보 테스트 진행 중**
실기기 실행 환경과 터치패드 입력을 확인했고, 방향·거리를 바꾸는 HUD 연습 코드를 구현했습니다. 
현재는 Android 기초를 학습하면서 위치 정보 연동을 준비하고 있습니다.

### 단계 완료 추이

## 🧭 전체 계획

**✅ 완료 · 🔄 진행 중 · ⬜ 예정**

기초 학습은 기능 개발과 병행하고 있습니다. 위치 수신을 먼저 검증한 뒤 지도와 경로 안내를 연결하고, 마지막으로 실기기에서 전체 흐름을 확인할 계획입니다.

| 단계 | 제작·학습 내용 | 진행 여부 | 완료 기준 / 현재 상태 |
| --- | --- | --- | --- |
| 01 | 개발 환경과 실기기 실행 | ✅ 완료 | Android Studio·ADB 연결, APK 설치, Blade 2 첫 화면 실행 확인 |
| 02 | 터치패드 입력 처리 | ✅ 완료 | 스와이프·탭 입력의 실기기 동작 확인 |
| 03 | 방향·거리 HUD 프로토타입 | ✅ 완료 | 방향·거리 변경, 근접·도착 안내, 초기화 코드 구현 및 GitHub 업로드 |
| 04 | Kotlin·Android·XML 기초 및 화면 점검 | 🔄 진행 중 | 코드와 레이아웃의 연결, 이벤트·생명주기 학습. 글라스 크기의 에뮬레이터에서 배치·가독성 확인 예정 |
| 05 | 위치 권한과 위치 수신 검증 | 🔄 진행 중 | 테스트 코드 준비. 실제 좌표 수신과 이동에 따른 갱신 검증 필요 |
| 06 | 위치 정보와 HUD 연결 | ⬜ 예정 | 수동 입력 대신 실제 위치 데이터를 화면에 반영하고 위치 수신 실패 상태 처리 |
| 07 | 2D 지도와 현재 위치 표시 | ⬜ 예정 | 지도 표시 방식 선정, 현재 위치 표시 및 이동에 따른 갱신 |
| 08 | 목적지 설정과 도보 경로 안내 | ⬜ 예정 | 목적지 설정 → 경로 조회 → 남은 거리·회전 안내 → 도착 처리 연결 |
| 09 | HUD ↔ 지도 전환 및 실기기 통합 검증 | ⬜ 예정 | 터치패드 화면 전환, 실외 이동 테스트, 위치 오차·권한 거부·앱 복귀 상황 점검 |
| 10 | 최종 개선과 첫 버전 완성 | ⬜ 예정 | 오류·가독성 개선, 실행 방법과 제한 사항 정리, APK·화면 캡처·시연 영상으로 결과 기록 |

**완성 목표:** Blade 2에서 목적지를 설정하고, 현재 위치와 도보 경로를 확인하며, 터치패드로 HUD와 지도를 전환해 목적지 도착까지 안내받는 첫 버전을 만드는 것입니다.

단계별 구현과 검증이 끝나면 진행 상태와 그래프를 함께 갱신하겠습니다.

### 주요 파일

| 파일 | 담당 내용 |
| --- | --- |
| [MainActivity.kt](app/src/main/java/com/example/myapplication/MainActivity.kt) | 입력 처리, 거리·방향 상태 변경, 화면 갱신 |
| [activity_main.xml](app/src/main/res/layout/activity_main.xml) | 화살표·거리·안내 문구 화면 구성 |
| [AndroidManifest.xml](app/src/main/AndroidManifest.xml) | 앱과 시작 Activity 설정 |
| [app/build.gradle.kts](app/build.gradle.kts) | Android SDK 및 의존성 설정 |

**사용 기술:** Kotlin · Android XML Views · AppCompatActivity · KeyEvent · Gradle Kotlin DSL · Android Studio · ADB


---

<div align="center">

**[OptometristChris](https://github.com/OptometristChris)** · Vuzix Blade 2 · Android Learning Log

</div>
