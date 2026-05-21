# Security Fix Plan — langsmith-java

Validated 2026-05-21 against open Dependabot alerts.

## Status

| Item | Priority | Scope | Status |
|------|----------|-------|--------|
| OpenTelemetry 1.32.0 → 1.62.0 | P1 | **Published** (affects end users) | ✅ Done |
| Tomcat 9.0.115 → 9.0.118 | P2 | Example module only (non-published) | ✅ Done |
| Jetty 9.4.57 → 9.4.58 (http2, server) | P3 | Test scope only | ✅ Done |
| Logback 1.2.13 → 1.5.32 | P4 | Test + example scope (non-published) | ✅ Done |
| Spring 5.3.34 → 5.3.39 | P5 | Example module only (non-published) | ✅ Done |
| SnakeYAML 1.31 → 1.32 | P6 | Example module only (non-published) | ✅ Done |
| opennlp-tools 2.5.4 → 2.5.9 | P7 | Test scope only (from langchain4j test dep) | ✅ Done |
| Bouncy Castle 1.80/1.80.2 → 1.84 (bcprov/bcpg/bcpkix) | P8 | Test scope + buildSrc (signing) | ✅ Done |
| plexus-utils 4.0.2 → 4.0.3 | P9 | buildSrc (Gradle plugin infra) | ✅ Done |
| Spring Boot 3.x upgrade (example) | Upstream | Removes 17 no-fix-available alerts | ⏳ Future |

## Alerts Already Fixed (Stale — Can Be Dismissed)

These 15 alerts show as open but the code already addresses them via explicit constraints:

| Alert # | CVE | Package | Fixed By |
|---------|-----|---------|----------|
| #50 | CVE-2024-13009 | jetty-server | `require("9.4.57.v20241219")` |
| #39 | CVE-2024-8184 | jetty-server | `require("9.4.57.v20241219")` |
| #28 | CVE-2023-44487 | http2-server | sibling of constrained http2-common |
| #27 | CVE-2023-44487 | http2-common | `require("9.4.57.v20241219")` |
| #25 | CVE-2024-22201 | http2-common | `require("9.4.57.v20241219")` |
| #17 | CVE-2023-36478 | http2-hpack | `require("9.4.57.v20241219")` |
| #13 | CVE-2023-26049 | jetty-server | `require("9.4.57.v20241219")` |
| #12 | CVE-2023-26048 | jetty-server | `require("9.4.57.v20241219")` |
| #62 | CVE-2025-48976 | commons-fileupload | `require("1.6.0")` |
| #10 | CVE-2023-24998 | commons-fileupload | `require("1.6.0")` |
| #38 | CVE-2024-47554 | commons-io | `require("2.14.0")` |
| #11 | CVE-2023-1370 | json-smart | `require("2.4.9")` |
| #61 | CVE-2025-52999 | jackson-core | published at 2.18.6 |
| #75 | GHSA-72hv-8253-57qq | jackson-core | published at 2.18.6 (patched version) |
| #76 | GHSA-72hv-8253-57qq | jackson-core | 2.18.6 not in vulnerable range (≥2.19 only) |

## No Fix Available (Upstream — Spring 5.x Limitations)

These require either a Spring Boot 3.x upgrade or a Jetty major version upgrade.
They live entirely in the non-published `langsmith-java-example` module.

| Alert #s | CVEs | Package | Reason |
|---------|------|---------|--------|
| #7 | CVE-2016-1000027 | spring-web | Requires spring-web 6.0 (Spring Boot 3.x) |
| #42, #53 | CVE-2024-38816, CVE-2024-38819 | spring-webmvc | No fix in Spring 5.x |
| #49, #104 | CVE-2025-22235, CVE-2026-40973 | spring-boot | No fix available |
| #55, #56 | CVE-2024-38820 | spring-web/context | No fix available |
| #57 | CVE-2025-22233 | spring-context | No fix available |
| #64 | CVE-2025-41242 | spring-webmvc | No fix in Spring 5.x |
| #67 | CVE-2025-41249 | spring-core | No fix in Spring 5.x |
| #83, #84 | CVE-2026-22735, CVE-2026-22737 | spring-webmvc | No fix in Spring 5.x |
| #99 | CVE-2026-2332 | jetty-http | No 9.x fix |
| #105, #106 | CVE-2026-22741, CVE-2026-22745 | spring-webmvc | No fix available |
| #77 | CVE-2025-11143 | jetty-http | No 9.x fix |
| #40 | CVE-2024-6763 | jetty-http | Fix is Jetty 12 only |
