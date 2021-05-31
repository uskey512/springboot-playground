# springboot-sentry
SpringBoot/Sentry 検証用プロジェクト
- ためしていること
  - 例外の選択的な送出
  - Git連携 [n0mer/gradle-git-properties](https://github.com/n0mer/gradle-git-properties)
    - [Using Git Commit ID As The Release](https://docs.sentry.io/platforms/java/guides/spring-boot/advanced-usage/#using-git-commit-id-as-the-release)

- 構成
  - Java 16
  - SpringBoot 2.5.0
  - sentry-spring-boot-starter 5.0.0-beta.5
  - com.gorylenko.gradle-git-properties version 2.3.1

- sentry.dsn は application.propertiesに記載の上コミットしていない
