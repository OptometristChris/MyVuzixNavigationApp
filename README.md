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

**실기기 실행·터치패드 입력 확인 및 HUD 프로토타입 구현 · Android 기초 학습과 위치 수신 검증 진행 중**

Blade 2에서 앱 실행과 터치패드 입력을 확인했고, 방향·거리를 수동으로 변경하는 HUD 연습 화면을 구현했습니다. 

실시간 위치 연동, 지도 표시, 도보 경로 탐색과 이동 중 안내는 앞으로 구현할 예정입니다.

## 🧭 전체 계획

**✅ 완료 · 🔄 진행 중 · ⬜ 예정**

기초 학습을 병행하면서 **실시간 위치 수신 → 지도 API 연동 → 목적지 설정 → 도보 경로 탐색 → 실시간 안내 → 실외 검증** 순서로 개발할 계획입니다.

| 단계 | 제작·학습 내용 | 진행 여부 | 완료 기준 / 현재 상태 |
| --- | --- | --- | --- |
| 01 | 개발 환경과 실기기 실행 | ✅ 완료 | Android Studio·ADB 연결, APK 설치, Blade 2 첫 화면 실행 확인 |
| 02 | 터치패드 입력 처리 | ✅ 완료 | 스와이프·탭 입력의 실기기 동작 확인 |
| 03 | 방향·거리 HUD 프로토타입 | ✅ 완료 | 수동 거리·방향 변경, 근접·도착 문구, 초기화 코드 구현 및 GitHub 업로드 |
| 04 | Kotlin·Android·XML 기초 학습 | 🔄 진행 중 | 코드와 레이아웃 연결, 이벤트 처리, Activity 생명주기 학습 |
| 05 | 글라스 화면에 맞춘 UI 점검 | ⬜ 예정 | 에뮬레이터와 실기기에서 글자 크기·배치·잘림·가독성 확인 |
| 06 | 위치 권한과 위치 수신 방식 검증 | 🔄 진행 중 | 테스트 코드 준비. 기기에서 사용할 위치 Provider와 Companion 연동 여부, 실제 좌표 수신 확인 필요 |
| 07 | 실시간 GPS·위치 업데이트 연동 | ⬜ 예정 | 이동에 따른 좌표·정확도·수신 시각 갱신, 위치 업데이트 시작·중지 처리 |
| 08 | 지도 SDK/API 선정 및 연동 | ⬜ 예정 | 제공 서비스 선정, API 키 설정, Blade 2 호환성 확인 및 지도 화면 표시 |
| 09 | 지도에 현재 위치 표시 | ⬜ 예정 | 실시간 위치 마커 갱신, 현재 위치로 이동, 지도 확대·축소 조작 |
| 10 | 목적지 선택 및 장소 검색 API 연동 | ⬜ 예정 | 초기 고정 목적지 선택부터 구현하고, 장소·주소 검색과 검색 결과 선택으로 확장 |
| 11 | 도보 경로 API 연동 | ⬜ 예정 | 현재 위치·목적지 좌표로 경로 요청, 경로 좌표·거리·회전 안내 데이터 처리 |
| 12 | 지도에 경로 표시 | ⬜ 예정 | 출발지·목적지 마커와 경로선 표시, 전체 경로 확인 |
| 13 | 이동에 따른 경로 진행 계산 | ⬜ 예정 | 현재 경로 구간 파악, 다음 회전 지점까지 거리와 남은 경로 거리 계산, 안내 단계 전환 |
| 14 | 실제 경로 안내와 HUD 연결 | ⬜ 예정 | 수동 입력을 실제 계산값으로 교체하고 방향 화살표·거리·안내 문구 갱신 |
| 15 | 경로 이탈·재탐색·도착 판정 | ⬜ 예정 | 위치 오차를 고려한 이탈 판단, 현재 위치 기준 경로 재요청, 도착 시 안내 종료 |
| 16 | HUD ↔ 지도 전환 및 안내 조작 | ⬜ 예정 | 터치패드로 화면 전환, 안내 시작·중지, 현재 위치 재확인 |
| 17 | 예외 처리와 앱 상태 관리 | ⬜ 예정 | 권한 거부, 위치 미수신, Companion 연결 끊김, 네트워크·API 실패, 앱 복귀 처리 |
| 18 | 실외 보행 테스트와 최종 개선 | ⬜ 예정 | 실제 이동 중 위치 정확도·회전 안내 시점·재탐색·가독성·배터리 사용 검증 및 수정 |
| 19 | 첫 버전 완성 및 배포 | ⬜ 예정 | 목적지 설정부터 도착까지 전체 동작 확인, APK 배포, 실행 방법·제한 사항·시연 영상 정리 |

**완성 목표:** 스마트글라스에서 직접 실행되는 실용적인 내비게이션 앱을 만들며, 기획부터 디자인·개발·테스트·피드백을 반영한 개선·배포까지 전 과정을 혼자 경험하는 것입니다.

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
