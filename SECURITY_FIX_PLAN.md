# Security Fix Plan - langsmith-java

Validated 2026-07-02 against the open Dependabot alerts for `langsmith-java-staging`.

## Status

| Item | Scope | Status |
|------|-------|--------|
| Jackson 2.13.4/2.14.0/2.18.6 -> 2.22.0 | Published SDK + examples + tests | Done |
| Spring Boot 2.7.18 -> 3.5.16 | Example module only, non-published | Done |
| Spring Framework 5.x pins removed | Example module only, non-published | Done |
| Tomcat 9.x pins removed | Example module only, non-published | Done |
| SnakeYAML 1.x pin removed | Example module only, non-published | Done |
| WireMock JRE8 2.35.2 -> org.wiremock:wiremock 4.0.0-beta.37 | Test scope only | Done |
| Jetty test constraints -> 12.1.10 | Test scope only | Done |
| Bouncy Castle test constraints -> 1.84 | Test scope only | Done |
| Log4j Core test constraint -> 2.25.4 | Test scope only | Done |
| OpenNLP test constraint -> 2.5.9 | Test scope only | Done |
| Handlebars test constraint -> 4.5.2 | Test scope only | Done |
| Plexus Utils test constraint -> 4.0.3 | Test scope only | Done |
| Commons/Guava/json-path/XMLUnit/json-smart test constraints bumped | Test scope only | Done |

## Notes

The Spring Boot upgrade is intentionally limited to the example module, which is not published as part
of the SDK artifacts. It removes the old Spring Boot 2/Spring Framework 5 workaround pins that kept
several alerts open.

WireMock 4 is currently beta-only, but it is test scoped and moves the test server dependency graph to
Jetty 12. Keeping WireMock 3 would still leave Jetty 11 in at least one advisory range.
