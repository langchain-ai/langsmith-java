# Changelog

## [0.1.0-beta.12](https://github.com/langchain-ai/langsmith-java/compare/v0.1.0-beta.11...v0.1.0-beta.12) (2026-07-08)


### ⚠ BREAKING CHANGES

* **stainless:** skip sessions resource for python and typescript

### Features

* **managed-eval:** expose is_managed_evaluator on run-rule read/write paths ([8e17124](https://github.com/langchain-ai/langsmith-java/commit/8e17124b681e504789b3bcb7b03653e327339d1a))
* **smith-sdks:** expose threads and traces v2 endpoints in public SDK ([3bc6173](https://github.com/langchain-ai/langsmith-java/commit/3bc61733286b179f5567439dd65cf94e6faff571))
* **stainless:** skip sessions resource for python and typescript ([d71cff9](https://github.com/langchain-ai/langsmith-java/commit/d71cff9f592c797a6b7383755ebfde6feea7e7c6))


### Bug Fixes

* remove duplicate threads/traces declarations in client impls ([#35](https://github.com/langchain-ai/langsmith-java/issues/35)) ([fdba8e6](https://github.com/langchain-ai/langsmith-java/commit/fdba8e6123bda467312acd260ef7cf20e21dba9b))
* **smith-sdks:** remove dead retrieve_thread_preview SDK mapping ([585b12d](https://github.com/langchain-ai/langsmith-java/commit/585b12dd2672808df97c6221c783342e17dd6755))
* **smith-sdks:** rename dataset runs POST methods from create to query ([4513b3f](https://github.com/langchain-ai/langsmith-java/commit/4513b3ffb05b51ec5be3e5f394d312726de1dd13))


### Chores

* **stainless:** skip all datasets endpoints in Python/TS SDKs except experiment-runs ([6ab6fa2](https://github.com/langchain-ai/langsmith-java/commit/6ab6fa281f3f9db790121a94d20a32323e56dc80))

## [0.1.0-beta.11](https://github.com/langchain-ai/langsmith-java/compare/v0.1.0-beta.10...v0.1.0-beta.11) (2026-07-02)


### ⚠ BREAKING CHANGES

* disallow run_count session sort

### Bug Fixes

* restore title/additionalProperties on v2 RunResponse JSON fields for Stainless ([e3b4784](https://github.com/langchain-ai/langsmith-java/commit/e3b478437ef307d6895f0256b4945e68f5e32a23))


### Refactors

* disallow run_count session sort ([a00b1f1](https://github.com/langchain-ai/langsmith-java/commit/a00b1f18ca2c9b6048f4789df0da60704852a79a))

## [0.1.0-beta.10](https://github.com/langchain-ai/langsmith-java/compare/v0.1.0-beta.9...v0.1.0-beta.10) (2026-07-01)


### Features

* **evaluation:** add core evaluate() param parity ([#17](https://github.com/langchain-ai/langsmith-java/issues/17)) ([7d9a2fa](https://github.com/langchain-ai/langsmith-java/commit/7d9a2fafd45c60dbe11852c1c4c74565c4517595))


### Bug Fixes

* **ci:** add GH_REPO to release-please trigger publish step ([#24](https://github.com/langchain-ai/langsmith-java/issues/24)) ([10a1f9b](https://github.com/langchain-ai/langsmith-java/commit/10a1f9bcbbf662e048b4e4f0a1bb4e9a29f18bc7))
* update hand-written code to use RunIngest after stainless rename ([#25](https://github.com/langchain-ai/langsmith-java/issues/25)) ([4d45358](https://github.com/langchain-ai/langsmith-java/commit/4d45358e0ef8c0df8905cc3f927a495af2bcbeca))


### Chores

* **examples:** dual-write source run lookup coordinates in Python ([2d4900b](https://github.com/langchain-ai/langsmith-java/commit/2d4900b16bdda9512fa71368dd03f4729f55620a))
* **stainless:** rename run models in runs resource ([2f0ce40](https://github.com/langchain-ai/langsmith-java/commit/2f0ce40b862dc33d52ff8cb0fb8d50fde790ef73))

## [0.1.0-beta.9](https://github.com/langchain-ai/langsmith-java/compare/v0.1.0-beta.8...v0.1.0-beta.9) (2026-06-29)


### ⚠ BREAKING CHANGES

* **api:** document v2 experiment-runs and de-publicize legacy dataset endpoints
* **backend:** accept float value for percentile metric [LS-000]

### Features

* add GET endpoint to retrieve single workspace by id [closes ([34f1c52](https://github.com/langchain-ai/langsmith-java/commit/34f1c52fc1088310910de4f21670e2a4d41d196b))
* add GET endpoint to retrieve single workspace by id [closes ENT-508] ([cdbd369](https://github.com/langchain-ai/langsmith-java/commit/cdbd36936fde80c7c3dea773deefd2789d0feecf))
* **api:** document v2 experiment-runs and de-publicize legacy dataset endpoints ([387526f](https://github.com/langchain-ai/langsmith-java/commit/387526fd3ac9e892de0786be5b538c53d2f40049))
* **evaluation:** add Java evaluate orchestrator ([#8](https://github.com/langchain-ai/langsmith-java/issues/8)) ([34f1c52](https://github.com/langchain-ai/langsmith-java/commit/34f1c52fc1088310910de4f21670e2a4d41d196b))
* **evaluation:** add Java evaluate orchestrator ([#8](https://github.com/langchain-ai/langsmith-java/issues/8)) ([d1420ef](https://github.com/langchain-ai/langsmith-java/commit/d1420efd7a9c307d8b99d64ac57e3f0f26b1580b))
* **sandbox-host:** per-VM cgroups for CPU bursting (2x), fractional ([34f1c52](https://github.com/langchain-ai/langsmith-java/commit/34f1c52fc1088310910de4f21670e2a4d41d196b))
* **sandbox-host:** per-VM cgroups for CPU bursting (2x), fractional vCPU, and sustained-burst limiting ([49bf68d](https://github.com/langchain-ai/langsmith-java/commit/49bf68d74763138fa7894d0e04eb1b73e72e82b3))
* **sandboxes:** expose registry CRUD and generate Python/TypeScript SDK ([34f1c52](https://github.com/langchain-ai/langsmith-java/commit/34f1c52fc1088310910de4f21670e2a4d41d196b))
* **sandboxes:** expose registry CRUD and generate Python/TypeScript SDK clients ([cfed196](https://github.com/langchain-ai/langsmith-java/commit/cfed196979dce85b747a4171cb1dcacb38f88641))


### Bug Fixes

* **backend:** accept float value for percentile metric [LS-000] ([e885608](https://github.com/langchain-ai/langsmith-java/commit/e88560861c9f3de50e7448b97d2cde1cfdfbca46))
* trigger publish-sonatype workflow after release-please creates a ([34f1c52](https://github.com/langchain-ai/langsmith-java/commit/34f1c52fc1088310910de4f21670e2a4d41d196b))
* trigger publish-sonatype workflow after release-please creates a release ([#13](https://github.com/langchain-ai/langsmith-java/issues/13)) ([70edc45](https://github.com/langchain-ai/langsmith-java/commit/70edc4514cfc54a98fbf5605795a386b8149300d))

## [0.1.0-beta.8](https://github.com/langchain-ai/langsmith-java/compare/v0.1.0-beta.7...v0.1.0-beta.8) (2026-06-25)


### ⚠ BREAKING CHANGES

* **sandboxes:** default S3 mount endpoint
* **sandboxes:** add ArtifactFS git mounts
* **sandboxes:** add gcs bucket mounts

### Features

* **abac:** add tag_value_ids to dataset creation endpoints ([280a374](https://github.com/langchain-ai/langsmith-java/commit/280a37489da492957d07773692e5ae62140d98d0))
* **abac:** add tag_value_ids to prompt creation endpoints [ENT-1176] ([f3ce273](https://github.com/langchain-ai/langsmith-java/commit/f3ce273a028c0de24171835d854edb4c69268d91))
* **abac:** add tag_value_ids to tracer session creation ([f859585](https://github.com/langchain-ai/langsmith-java/commit/f859585592c616310f02f91d8f0f6822ab9be17d))
* add online evaluator endpoints to stainless config ([77d19d3](https://github.com/langchain-ai/langsmith-java/commit/77d19d324195ca6a93b51ea74aaa4484fb7a2cef))
* adding time to first token for experiment metrics ([5a6bddd](https://github.com/langchain-ai/langsmith-java/commit/5a6bddd241bb95b0d176d70ae36c810a8157177d))
* **backend:** allow retrieving and storing V2 charts in database [LSO-2799] ([b86e854](https://github.com/langchain-ai/langsmith-java/commit/b86e854687089b26205de336c8c99d994fd57369))
* end-to-end OAuth bearer for Playground [part of ENT-760] ([77f12e3](https://github.com/langchain-ai/langsmith-java/commit/77f12e3a6e6d627a0e2309ecd35396abb01448ac))
* **evaluation:** Java evaluate() primitives ([#7](https://github.com/langchain-ai/langsmith-java/issues/7)) ([a82b5c8](https://github.com/langchain-ai/langsmith-java/commit/a82b5c88fc08de041e78657d368c2b0359196248))
* **fleet:** frontend passes typed fields (closes AB-000) ([bbbcf7b](https://github.com/langchain-ai/langsmith-java/commit/bbbcf7bf4027f95b13f2a0bffe18564da3fcfbe9))
* **group-stats:** back thread stats with SmithDB ([7f24878](https://github.com/langchain-ai/langsmith-java/commit/7f24878418347b187fbc2c7064c52725de775c8b))
* **hub:** add include_owners to repos list for Fleet [closes AB-2537] ([10f1d65](https://github.com/langchain-ai/langsmith-java/commit/10f1d6506332402672366470117774db374350a6))
* make online evaluator retention opt-in (backend) ([e480cd4](https://github.com/langchain-ai/langsmith-java/commit/e480cd4104a22b71607aca0f209b416320fe62e0))
* **run-rules:** per-action trace-retention control for automations [LSO-2749] ([3c218e9](https://github.com/langchain-ai/langsmith-java/commit/3c218e98bc255847a60b75499d9230372468adb6))
* **runs/v2:** expose runs v2 endpoints publicly with stainless config ([48c283c](https://github.com/langchain-ai/langsmith-java/commit/48c283c7a7448b03b52185053a578027005bbdbd))
* **sandboxes:** add ArtifactFS git mounts ([2ddc687](https://github.com/langchain-ai/langsmith-java/commit/2ddc687610df41bf15429b2492fd85cbcff86472))
* **sandboxes:** add GCP proxy auth flow ([fd2980c](https://github.com/langchain-ai/langsmith-java/commit/fd2980ce69f3be63a0fd44922f08f72a0a6d9ac2))
* **sandboxes:** add gcs bucket mounts ([87e3acb](https://github.com/langchain-ai/langsmith-java/commit/87e3acbb7b1d871a44e82472ff7fbce8669395de))
* **sandboxes:** add sandbox env var support ([da0fc7b](https://github.com/langchain-ai/langsmith-java/commit/da0fc7b507828609f0264e90a50f6f8910ce9567))
* **sandboxes:** filter lists by creator [INF-1492] ([bb9f973](https://github.com/langchain-ai/langsmith-java/commit/bb9f973f41a930ed23d33ee42deeaaaba4d07c35))
* **sandboxes:** move mounts under mount_config ([734a828](https://github.com/langchain-ai/langsmith-java/commit/734a8285cd37d10e9676e67ae8fa98b6420514b0))
* **sandboxes:** proxy runtime routes through platform backend [INF-0000] ([7cb70fc](https://github.com/langchain-ai/langsmith-java/commit/7cb70fc3e3dc71788c9ad66360dbcf4d577a098d))
* **sandboxes:** resolve AWS proxy rule secrets ([cb519f9](https://github.com/langchain-ai/langsmith-java/commit/cb519f93d44d0a34633cae88c0fa79a4c3db182b))
* **sandboxes:** set AWS proxy compatibility env ([6bbe522](https://github.com/langchain-ai/langsmith-java/commit/6bbe522f0a167e6671c5528eec2fa95dde0b680e))
* **sandboxes:** snapshot memory from stopped boxes + honor restore_memory in v2 [INF-0000] ([79647d1](https://github.com/langchain-ai/langsmith-java/commit/79647d1579da9cdc6027f7922075ddb489e9601a))
* **stats:** add include_details param to /runs/stats for backwards compat ([49039f2](https://github.com/langchain-ai/langsmith-java/commit/49039f277018a60f46af85108a30815609c8482c))


### Bug Fixes

* **evaluators:** show code evaluator trace counts [LSE-2359] ([3f3a0c9](https://github.com/langchain-ai/langsmith-java/commit/3f3a0c9c30fc61198a19b27c7b3c6b8e5aa444c6))
* **sandboxes:** default S3 mount endpoint ([54d105e](https://github.com/langchain-ai/langsmith-java/commit/54d105ef91e0c65de0f2a77ccc7e794570da15cb))
* **sandboxes:** use built-in gcp proxy host matching ([ac8da0f](https://github.com/langchain-ai/langsmith-java/commit/ac8da0f77c706c7fc072842d5ec4e95b4f82a2d7))
* **tests:** remove duplicate retrieve() method in RunServiceTest ([#10](https://github.com/langchain-ai/langsmith-java/issues/10)) ([ba419de](https://github.com/langchain-ai/langsmith-java/commit/ba419de13e4749f8427a98b1572bc1764404dd20))


### Chores

* add release-please workflow ([#11](https://github.com/langchain-ai/langsmith-java/issues/11)) ([65b5b9a](https://github.com/langchain-ai/langsmith-java/commit/65b5b9ae402be8b84253d5ca7c255bd188c0e415))
* add stlc sync and promotion workflows ([#5](https://github.com/langchain-ai/langsmith-java/issues/5)) ([f00fef5](https://github.com/langchain-ai/langsmith-java/commit/f00fef565e6c5c5edfa651223790e8e9cf90c317))
* **fleet:** add param to list threads [closes AB-2522] ([8b85e16](https://github.com/langchain-ai/langsmith-java/commit/8b85e16472982a2821e82a6677c843d0565d17f3))
* **smith-sdks:** update Java SDK stainless custom-code tracking file ([17bb73a](https://github.com/langchain-ai/langsmith-java/commit/17bb73a0061627a86d2ed1dba19316dcdfaf9c6d))


### Refactors

* **playground:** remove legacy experiment endpoints [LSO-2230] ([370b940](https://github.com/langchain-ai/langsmith-java/commit/370b940a1ca252f0198b49d315749dc5d9282714))
* rename field to match prev trace retention fields ([b963cab](https://github.com/langchain-ai/langsmith-java/commit/b963cab6c63f10bed9a7a1237b6df12c111be9d4))

## 0.1.0-beta.7 (2026-05-27)

Full Changelog: [v0.1.0-beta.6...v0.1.0-beta.7](https://github.com/langchain-ai/langsmith-java/compare/v0.1.0-beta.6...v0.1.0-beta.7)

### Features

* **api:** api update ([cad4993](https://github.com/langchain-ai/langsmith-java/commit/cad499356e3a38d660814b7ceed92eafbcf2989d))
* **api:** api update ([84e287c](https://github.com/langchain-ai/langsmith-java/commit/84e287ca9be34e45b80fd0d33c3ebc1dd1ca0f32))
* **api:** api update ([ce44c3b](https://github.com/langchain-ai/langsmith-java/commit/ce44c3b540624598c9152b8d1d469bb28ec5c67e))
* **api:** api update ([81f7b39](https://github.com/langchain-ai/langsmith-java/commit/81f7b3937992f117bc573e968e9d5988c5bb5399))
* **api:** api update ([3d0c992](https://github.com/langchain-ai/langsmith-java/commit/3d0c992f4c4772d5a3e294ebeba2b28a641b21ed))
* **api:** api update ([b991c00](https://github.com/langchain-ai/langsmith-java/commit/b991c00c14ee68cffd2df17c6d6bdbc6c780cfd1))
* **api:** api update ([104d3c6](https://github.com/langchain-ai/langsmith-java/commit/104d3c65623d66f24f90589df3ee04586fa8d913))
* **api:** api update ([e01a424](https://github.com/langchain-ai/langsmith-java/commit/e01a42416bef9d17a897900e70cbef70e13ad552))
* **api:** api update ([e1443b6](https://github.com/langchain-ai/langsmith-java/commit/e1443b69ab955cbdcee618449f11bc3cdd41add4))
* **api:** api update ([9deafad](https://github.com/langchain-ai/langsmith-java/commit/9deafade612c0e7c163bf13fae4c2d27751122be))
* **api:** api update ([7e7c479](https://github.com/langchain-ai/langsmith-java/commit/7e7c479912229f27ae96878f2e939971b5fff829))
* **api:** api update ([b5a3200](https://github.com/langchain-ai/langsmith-java/commit/b5a32009fc34eb5a04d70205c19bf973414d800f))
* **api:** api update ([3ab0c6c](https://github.com/langchain-ai/langsmith-java/commit/3ab0c6c5482c2378fc1d2a2b8657248ec218a501))
* **client:** support proxy authentication ([d9e3ab5](https://github.com/langchain-ai/langsmith-java/commit/d9e3ab5b34a8fc2321fb1f9f86910517ec30dbdb))
* **sdk:** add hub directories endpoints to Stainless config ([b3dbb81](https://github.com/langchain-ai/langsmith-java/commit/b3dbb81bd63f8b21fce99d345cf9c73345626451))


### Bug Fixes

* **go:** avoid panic when http.DefaultTransport is wrapped ([aba9578](https://github.com/langchain-ai/langsmith-java/commit/aba9578496866a723d85540da2d9f9bc6418027a))
* **go:** avoid panic when http.DefaultTransport is wrapped ([9ea7653](https://github.com/langchain-ai/langsmith-java/commit/9ea76536a054185cbfdad5ddad7036b2e5d46137))
* restore dokka-javadoc plugin application to subprojects ([#157](https://github.com/langchain-ai/langsmith-java/issues/157)) ([1df1c4a](https://github.com/langchain-ai/langsmith-java/commit/1df1c4aacd6c3cc9477576403a1da641bd20302d))


### Performance Improvements

* **client:** create one json mapper ([e68229b](https://github.com/langchain-ai/langsmith-java/commit/e68229b7009315bf60149df92e4af5f0b083c012))


### Chores

* **internal:** codegen related update ([5e551de](https://github.com/langchain-ai/langsmith-java/commit/5e551de99e03fb34a737f3fcac3ee6a08fab8863))
* **internal:** renormalize gradlew.bat line endings ([4738606](https://github.com/langchain-ai/langsmith-java/commit/4738606db159ecc8ad5088714e3100c0e7972f52))
* remove duplicated dokka setup ([b1af8d8](https://github.com/langchain-ai/langsmith-java/commit/b1af8d842d8aa3b1a47cb00ffa22d71134b0d883))


### Documentation

* clarify forwards compat behavior ([d4b4164](https://github.com/langchain-ai/langsmith-java/commit/d4b41649cb18523851c353c6a47b83b492e0c8e5))

## 0.1.0-beta.6 (2026-05-20)

Full Changelog: [v0.1.0-beta.5...v0.1.0-beta.6](https://github.com/langchain-ai/langsmith-java/compare/v0.1.0-beta.5...v0.1.0-beta.6)

### Bug Fixes

* patch security alerts — OTel, Tomcat, Jetty, Logback, Spring, SnakeYAML ([#153](https://github.com/langchain-ai/langsmith-java/issues/153)) ([dfa5469](https://github.com/langchain-ai/langsmith-java/commit/dfa54697292c14a987320ba776b580ee25c58f94))
## 0.1.0-beta.5 (2026-05-13)

Full Changelog: [v0.1.0-beta.4...v0.1.0-beta.5](https://github.com/langchain-ai/langsmith-java/compare/v0.1.0-beta.4...v0.1.0-beta.5)

### Features

* **sandbox:** make snapshot optional ([#152](https://github.com/langchain-ai/langsmith-java/issues/152)) ([5849b16](https://github.com/langchain-ai/langsmith-java/commit/5849b1695ec4504460205c80cabf8d443fd8a5f0))


### Chores

* **deps:** bump actions/github-script from 8 to 9 ([#144](https://github.com/langchain-ai/langsmith-java/issues/144)) ([c3f8fbd](https://github.com/langchain-ai/langsmith-java/commit/c3f8fbd5449fb5f52529166fd9b2db5eb8dbe24a))
* **deps:** bump gradle/actions ([#143](https://github.com/langchain-ai/langsmith-java/issues/143)) ([fd8a8ae](https://github.com/langchain-ai/langsmith-java/commit/fd8a8aef399ba3784c6d459c758e7a06f6ee5e98))
* **deps:** bump the minor-and-patch group across 1 directory with 3 updates ([#145](https://github.com/langchain-ai/langsmith-java/issues/145)) ([c4a883d](https://github.com/langchain-ai/langsmith-java/commit/c4a883dfd2e89373180f88c7149c13ef426996ee))

## 0.1.0-beta.4 (2026-05-04)

Full Changelog: [v0.1.0-beta.3...v0.1.0-beta.4](https://github.com/langchain-ai/langsmith-java/compare/v0.1.0-beta.3...v0.1.0-beta.4)

### Features

* **api:** api update ([4dc8a79](https://github.com/langchain-ai/langsmith-java/commit/4dc8a7912f8b1b449ad65c24bdf74b667dde30f4))

## 0.1.0-beta.3 (2026-05-01)

Full Changelog: [v0.1.0-beta.2...v0.1.0-beta.3](https://github.com/langchain-ai/langsmith-java/compare/v0.1.0-beta.2...v0.1.0-beta.3)

## 0.1.0-beta.2 (2026-04-30)

Full Changelog: [v0.1.0-beta.1...v0.1.0-beta.2](https://github.com/langchain-ai/langsmith-java/compare/v0.1.0-beta.1...v0.1.0-beta.2)

### Bug Fixes

* Fix another build issue ([#141](https://github.com/langchain-ai/langsmith-java/issues/141)) ([46baa8a](https://github.com/langchain-ai/langsmith-java/commit/46baa8a73e2770e190966d237996135b7fb6b0a3))

## 0.1.0-beta.1 (2026-04-30)

Full Changelog: [v0.1.0-beta.0...v0.1.0-beta.1](https://github.com/langchain-ai/langsmith-java/compare/v0.1.0-beta.0...v0.1.0-beta.1)

### Chores

* Fix build ([#139](https://github.com/langchain-ai/langsmith-java/issues/139)) ([cbaa348](https://github.com/langchain-ai/langsmith-java/commit/cbaa3480cd21c2f90a0056a575e977af1bf906b6))

## 0.1.0-beta.0 (2026-04-30)

Full Changelog: [v0.1.0-alpha.28...v0.1.0-beta.0](https://github.com/langchain-ai/langsmith-java/compare/v0.1.0-alpha.28...v0.1.0-beta.0)

### Features

* Add autobatch tracing mode ([#134](https://github.com/langchain-ai/langsmith-java/issues/134)) ([230959e](https://github.com/langchain-ai/langsmith-java/commit/230959e124ec705648c4cd1e48da915d945154b8))
* Add multipart batching ([#138](https://github.com/langchain-ai/langsmith-java/issues/138)) ([288221c](https://github.com/langchain-ai/langsmith-java/commit/288221c44835d472eb9f0ff59d1f22d0ec150ccb))
* Add zstd compression to runs service ([#136](https://github.com/langchain-ai/langsmith-java/issues/136)) ([e412191](https://github.com/langchain-ai/langsmith-java/commit/e4121913a5d5a8a6de2a16e272925c947694e7c0))
* **api:** add workspaces ([cc88cdf](https://github.com/langchain-ai/langsmith-java/commit/cc88cdf706b9f2ff7a1e66e00273af027c60f203))
* **api:** api update ([c3252b8](https://github.com/langchain-ai/langsmith-java/commit/c3252b8becd6ee89c95dc6ae39bf701d76629e18))
* **api:** api update ([af1ba52](https://github.com/langchain-ai/langsmith-java/commit/af1ba5242ec894847e0dc007674681858cb37a42))
* **api:** api update ([e1cca2b](https://github.com/langchain-ai/langsmith-java/commit/e1cca2b004858451074865be8b9fb4e532f2f5f5))
* **api:** api update ([fd1fc58](https://github.com/langchain-ai/langsmith-java/commit/fd1fc5830a739a88c221e682d1520612c0e45e66))
* **api:** api update ([b487509](https://github.com/langchain-ai/langsmith-java/commit/b4875093d10d752fcc8c3757e33d6c2bbe334c15))
* **api:** api update ([0758583](https://github.com/langchain-ai/langsmith-java/commit/0758583e5cc42b465c662a2897fff92a6fd61394))
* **api:** api update ([1310303](https://github.com/langchain-ai/langsmith-java/commit/131030331c0bab2568498a2bff96112f0fe46fee))
* **api:** manual updates ([0be4215](https://github.com/langchain-ai/langsmith-java/commit/0be4215e63ce63ee562ce1c48b001a6848cce704))
* **api:** manual updates ([f35b312](https://github.com/langchain-ai/langsmith-java/commit/f35b31249d59265e74d6d33f4e3298fe416757ae))
* **api:** sandbox apis ([bd21a1d](https://github.com/langchain-ai/langsmith-java/commit/bd21a1df96b708ac04712aaed7ef1a95505cf1f1))
* **evaluators:** add list evaluators (GET /api/v1/runs/rules) ([be32489](https://github.com/langchain-ai/langsmith-java/commit/be324893c09e4ab6e2176dda1d2f6a6cf15413e6))
* Make autobatch queue denote batches by payload size, add aggregation delay ([#137](https://github.com/langchain-ai/langsmith-java/issues/137)) ([2fb72ae](https://github.com/langchain-ai/langsmith-java/commit/2fb72ae9681964dd2e798642d88ded506c8189b5))
* Merge enqueued posts and patches to optimize batching ([#135](https://github.com/langchain-ai/langsmith-java/issues/135)) ([d65e301](https://github.com/langchain-ai/langsmith-java/commit/d65e3019910bb077ea59056aa37c9d0ef30bfb1a))
* support setting headers via env ([567af0c](https://github.com/langchain-ai/langsmith-java/commit/567af0c1eba8bf2dc6648529c11260f36e586bd3))


### Chores

* **deps:** bump the minor-and-patch group across 1 directory with 5 updates ([#123](https://github.com/langchain-ai/langsmith-java/issues/123)) ([1f88790](https://github.com/langchain-ai/langsmith-java/commit/1f887908d8d851dc641905b7beb8cf4f7cf935b1))

## 0.1.0-alpha.28 (2026-04-14)

Full Changelog: [v0.1.0-alpha.27...v0.1.0-alpha.28](https://github.com/langchain-ai/langsmith-java/compare/v0.1.0-alpha.27...v0.1.0-alpha.28)

### Features

* **api:** api update ([35484cf](https://github.com/langchain-ai/langsmith-java/commit/35484cf9b1f1ed6642ef857d3fb4aefdb37ae369))

## 0.1.0-alpha.27 (2026-04-14)

Full Changelog: [v0.1.0-alpha.26...v0.1.0-alpha.27](https://github.com/langchain-ai/langsmith-java/compare/v0.1.0-alpha.26...v0.1.0-alpha.27)

## 0.1.0-alpha.26 (2026-04-13)

Full Changelog: [v0.1.0-alpha.25...v0.1.0-alpha.26](https://github.com/langchain-ai/langsmith-java/compare/v0.1.0-alpha.25...v0.1.0-alpha.26)

### Features

* Allow manually specifying parent run tree in traceable config ([#126](https://github.com/langchain-ai/langsmith-java/issues/126)) ([a1409fb](https://github.com/langchain-ai/langsmith-java/commit/a1409fb0d7c0319d4129daea5300578e4371a858))
* **api:** api update ([8198ce7](https://github.com/langchain-ai/langsmith-java/commit/8198ce7001d0656bcb4807331d385b0eb8b81a75))
* **api:** api update ([286a62f](https://github.com/langchain-ai/langsmith-java/commit/286a62fba8b5bac8105c71dc52b4a36a37012eae))


### Chores

* **deps:** bump gradle-wrapper from 8.12 to 9.4.1 ([#124](https://github.com/langchain-ai/langsmith-java/issues/124)) ([78b7db0](https://github.com/langchain-ai/langsmith-java/commit/78b7db0e1f08c6de8c12af504dd098cf7c958faa))
* **deps:** bump gradle/actions ([#121](https://github.com/langchain-ai/langsmith-java/issues/121)) ([e3ca5d7](https://github.com/langchain-ai/langsmith-java/commit/e3ca5d7b712f92ce72586bfd7be208c73cec332f))
* **deps:** bump gradle/gradle-build-action ([#122](https://github.com/langchain-ai/langsmith-java/issues/122)) ([d91305f](https://github.com/langchain-ai/langsmith-java/commit/d91305f9157b8d73dfaf8a925c7b2b0e5743f4b2))


### Documentation

* improve examples ([1556365](https://github.com/langchain-ai/langsmith-java/commit/1556365dd6c04f3290b9a836b3c28c09056be5ad))

## 0.1.0-alpha.25 (2026-03-31)

Full Changelog: [v0.1.0-alpha.24...v0.1.0-alpha.25](https://github.com/langchain-ai/langsmith-java/compare/v0.1.0-alpha.24...v0.1.0-alpha.25)

### Features

* Add `traceable` function wrapper for LangSmith tracing ([#101](https://github.com/langchain-ai/langsmith-java/issues/101)) ([f3bf340](https://github.com/langchain-ai/langsmith-java/commit/f3bf3404fe56be9801806ea44f283eb586d96ce8))
* Adds package version resource to build ([#100](https://github.com/langchain-ai/langsmith-java/issues/100)) ([31cc003](https://github.com/langchain-ai/langsmith-java/commit/31cc0037be79a336cd86f6d53c7093f6c3fb7034))
* Adds processInputs and processOutputs to traceable ([#113](https://github.com/langchain-ai/langsmith-java/issues/113)) ([ee2991f](https://github.com/langchain-ai/langsmith-java/commit/ee2991f830703f29b3d0eddfd621109362a465e5))
* Adds streaming support for wrapOpenAI ([#118](https://github.com/langchain-ai/langsmith-java/issues/118)) ([aae9d2c](https://github.com/langchain-ai/langsmith-java/commit/aae9d2c0dc7f7dae40960113154d9ddff3bd0e06))
* Adds support for tracing streams with traceable ([#117](https://github.com/langchain-ai/langsmith-java/issues/117)) ([0217521](https://github.com/langchain-ai/langsmith-java/commit/0217521b852c70dba4795b145b3eb7b16fd2d10f))
* **api:** api update ([9182ef8](https://github.com/langchain-ai/langsmith-java/commit/9182ef84e304c602899c73b6865473d3ade4953f))
* **api:** api update ([0c91488](https://github.com/langchain-ai/langsmith-java/commit/0c914884473e1de2877708cd92db30fdc8fc10aa))
* **api:** api update ([efa16fc](https://github.com/langchain-ai/langsmith-java/commit/efa16fcb5974fbd5500714936cb52a6e930a6181))
* **api:** api update ([979e8af](https://github.com/langchain-ai/langsmith-java/commit/979e8af2b6f01444bcea33e1e09d1acbc986a6be))
* **api:** api update ([cd9f555](https://github.com/langchain-ai/langsmith-java/commit/cd9f555e525172d5ba0bcb0cd033dc045a9026bd))
* **api:** api update ([af93e09](https://github.com/langchain-ai/langsmith-java/commit/af93e09dc9dd8597454b2a02b1ed37de4e71fde4))
* **api:** manual updates ([493d5e9](https://github.com/langchain-ai/langsmith-java/commit/493d5e9b2844ff160598b87602c9f91733722fe4))
* Rework wrapOpenAI ([#114](https://github.com/langchain-ai/langsmith-java/issues/114)) ([63e0bdc](https://github.com/langchain-ai/langsmith-java/commit/63e0bdc5c893185399065c2c602ed0d5c46bbc68))


### Bug Fixes

* Fix format detection when pulling legacy prompts ([#115](https://github.com/langchain-ai/langsmith-java/issues/115)) ([ea6c3d2](https://github.com/langchain-ai/langsmith-java/commit/ea6c3d29d7c726b7b8455e6e93ec3322330ea5e7))
* patch security alerts — bump Jackson and constrain vulnerable transitive deps ([#119](https://github.com/langchain-ai/langsmith-java/issues/119)) ([dfe092c](https://github.com/langchain-ai/langsmith-java/commit/dfe092c51ab27c3131b81785321664a75d584764))


### Chores

* **deps:** bump gradle/actions from 5 to 6 in the all-actions group ([#99](https://github.com/langchain-ai/langsmith-java/issues/99)) ([4ba75e7](https://github.com/langchain-ai/langsmith-java/commit/4ba75e7776499833eddb1959b194b71eb847840f))
* fix dependabot.yml posture issues ([#105](https://github.com/langchain-ai/langsmith-java/issues/105)) ([a0e5441](https://github.com/langchain-ai/langsmith-java/commit/a0e544170d0c62e340a6250c32b6b521f818eaa4))

## 0.1.0-alpha.24 (2026-03-25)

Full Changelog: [v0.1.0-alpha.23...v0.1.0-alpha.24](https://github.com/langchain-ai/langsmith-java/compare/v0.1.0-alpha.23...v0.1.0-alpha.24)

### Features

* **api:** api update ([8e94d9d](https://github.com/langchain-ai/langsmith-java/commit/8e94d9dc65dfacd3f238e88631623a1338edec2e))
* **api:** api update ([3288052](https://github.com/langchain-ai/langsmith-java/commit/32880529fe17d465d20ee922894a9e1af3351edd))
* **api:** api update ([a4e3e5c](https://github.com/langchain-ai/langsmith-java/commit/a4e3e5cb858e66a9409ac162f04660c514cc24df))
* **api:** api update ([ff16250](https://github.com/langchain-ai/langsmith-java/commit/ff162506f81ad1616567c9119ded36c1a344c774))
* **api:** api update ([ef7c7a7](https://github.com/langchain-ai/langsmith-java/commit/ef7c7a798786b073e403d994ee2a9367d4db59ee))
* **api:** api update ([643c7b1](https://github.com/langchain-ai/langsmith-java/commit/643c7b121acd874a72c36e80fbd6d8d4aa772319))
* **api:** api update ([4b9c97d](https://github.com/langchain-ai/langsmith-java/commit/4b9c97d873492f919885fc1e394d1819fbedd09a))
* **api:** api update ([ea4e843](https://github.com/langchain-ai/langsmith-java/commit/ea4e843eea1709113fd259659c2cc85fd6317fa5))
* **api:** api update ([74d2131](https://github.com/langchain-ai/langsmith-java/commit/74d213181b7a2398fa8852235de5a1123ff0a7fe))
* **api:** api update ([2708533](https://github.com/langchain-ai/langsmith-java/commit/27085335b36f0ecb249a3bd079f96d8d9fad6c1f))
* **api:** api update ([8f48677](https://github.com/langchain-ai/langsmith-java/commit/8f48677e5ca0dfd9c9e9bc248c204863f233542a))
* **api:** api update ([c11821f](https://github.com/langchain-ai/langsmith-java/commit/c11821f56ba08939568332468a1e9376c78e6372))
* **api:** api update ([44fe8b3](https://github.com/langchain-ai/langsmith-java/commit/44fe8b31986af7ae7ac489c0a59335afb8021f9f))
* **api:** api update ([d11c759](https://github.com/langchain-ai/langsmith-java/commit/d11c759b1cf0d360f07aa0807f554c36f3262b14))
* **api:** manual updates ([09f1302](https://github.com/langchain-ai/langsmith-java/commit/09f1302329d0fcd9082bc52b2381271aabd71bab))
* **api:** manual updates ([dbed70a](https://github.com/langchain-ai/langsmith-java/commit/dbed70af760f0e807626650a2a7d6ecb8d30f0ad))
* **api:** manual updates ([48e2ca2](https://github.com/langchain-ai/langsmith-java/commit/48e2ca294bd412398290777db3ef14655ed47b1c))
* **api:** manual updates ([d8ac870](https://github.com/langchain-ai/langsmith-java/commit/d8ac87089db42004a53e880f419dcf6749c60817))
* **api:** manual updates ([bdb35f0](https://github.com/langchain-ai/langsmith-java/commit/bdb35f01f6374860fe6fa3c83f6f102f22590b23))


### Bug Fixes

* **client:** allow updating header/query affecting fields in `toBuilder()` ([5069881](https://github.com/langchain-ai/langsmith-java/commit/5069881aebcffc8ea2058de667a7af33efc15ec3))
* **client:** incorrect `Retry-After` parsing ([b607264](https://github.com/langchain-ai/langsmith-java/commit/b607264e2c7e10374f5d79d922c6850208b6f839))
* fix streaming in java sdk ([#95](https://github.com/langchain-ai/langsmith-java/issues/95)) ([76da93f](https://github.com/langchain-ai/langsmith-java/commit/76da93f2c0c3a0466feee196243a214e8642b303))


### Chores

* align user agent format ([#96](https://github.com/langchain-ai/langsmith-java/issues/96)) ([5cf06d6](https://github.com/langchain-ai/langsmith-java/commit/5cf06d612963f01b49d6f62117226d948e004046))
* **ci:** skip lint on metadata-only changes ([4c1197c](https://github.com/langchain-ai/langsmith-java/commit/4c1197ce483f317defed85f81d3ec3f5053f68d3))
* **ci:** skip uploading artifacts on stainless-internal branches ([c994122](https://github.com/langchain-ai/langsmith-java/commit/c994122d8c4eea78bb8a942b0ed1db58e6338e1e))
* **deps:** bump the all-actions group with 5 updates ([#92](https://github.com/langchain-ai/langsmith-java/issues/92)) ([3a1a72f](https://github.com/langchain-ai/langsmith-java/commit/3a1a72f5595393a437a8ddf1acc69bb44529b0e8))
* drop apache dependency ([75ca9d7](https://github.com/langchain-ai/langsmith-java/commit/75ca9d71b49bad02bdbd66141f693204b296a9ec))
* **internal:** bump ktfmt ([d9a4a39](https://github.com/langchain-ai/langsmith-java/commit/d9a4a396ad92c9f33c5922dabc00a8ba2451199b))
* **internal:** bump palantir-java-format ([576ebd2](https://github.com/langchain-ai/langsmith-java/commit/576ebd2a02613c632dd1e00ba9c606df99de8f37))
* **internal:** codegen related update ([29d55b0](https://github.com/langchain-ai/langsmith-java/commit/29d55b0ee9f40c2d327f1c08a714ccd9cad1384b))
* **internal:** expand imports ([4c7542f](https://github.com/langchain-ai/langsmith-java/commit/4c7542f4525b43d8fc2adcd7d084a080581b5c48))
* **internal:** tweak CI branches ([b7cecc1](https://github.com/langchain-ai/langsmith-java/commit/b7cecc1caa774426df72acd5734a2c29a96a3e60))
* **internal:** update gitignore ([d0df3fa](https://github.com/langchain-ai/langsmith-java/commit/d0df3fa13a923514d9d3c66d5d96b4fa1fea4a22))
* **internal:** update retry delay tests ([a9c7999](https://github.com/langchain-ai/langsmith-java/commit/a9c7999f55bc12c2d1bac268ce3a2ca5bbd58dc5))
* make `Properties` more resilient to `null` ([47c70f9](https://github.com/langchain-ai/langsmith-java/commit/47c70f91d5ec941fafc08a81baabf946602076c9))
* remove old test ([#97](https://github.com/langchain-ai/langsmith-java/issues/97)) ([79d708b](https://github.com/langchain-ai/langsmith-java/commit/79d708b935ba234c50d10980a7fef8ad12c58f61))
* update placeholder string ([be1baa7](https://github.com/langchain-ai/langsmith-java/commit/be1baa704ad8ebe899fbf8e4003f706fbc3d3f73))

## 0.1.0-alpha.23 (2026-02-20)

Full Changelog: [v0.1.0-alpha.22...v0.1.0-alpha.23](https://github.com/langchain-ai/langsmith-java/compare/v0.1.0-alpha.22...v0.1.0-alpha.23)

### Features

* **api:** api update ([9485112](https://github.com/langchain-ai/langsmith-java/commit/948511234707031e0e375ded4ed51cd142d0dae1))
* **api:** api update ([786edff](https://github.com/langchain-ai/langsmith-java/commit/786edfff5f8e200c20fb201d83daff8e0fe33b59))
* **api:** api update ([3a6c191](https://github.com/langchain-ai/langsmith-java/commit/3a6c1911a5127afe550cc6ff0cbc2182e7e9cce4))
* **api:** api update ([cd9f91d](https://github.com/langchain-ai/langsmith-java/commit/cd9f91d07e8e0c1c7d13f7a6a849856a9da19d90))
* **api:** api update ([b344828](https://github.com/langchain-ai/langsmith-java/commit/b3448285414b13fe8081c7b7eae023e033ad6ad2))
* **api:** api update ([2e0602a](https://github.com/langchain-ai/langsmith-java/commit/2e0602a9e218f3c9c435c7d1e254621d8f97f14b))
* **api:** api update ([3b1e4c6](https://github.com/langchain-ai/langsmith-java/commit/3b1e4c61e3b8ff44f0415aa808e6a7f550a7834b))
* **api:** api update ([703b77a](https://github.com/langchain-ai/langsmith-java/commit/703b77ac2c34ed600964d0c815b1fa759124756c))
* **api:** api update ([7d0f1d4](https://github.com/langchain-ai/langsmith-java/commit/7d0f1d4e07b0bd50a92947124e2bd1b83b840605))
* **api:** api update ([debadf0](https://github.com/langchain-ai/langsmith-java/commit/debadf0da6c073a569e1abea1c3b58fc8e33bcf4))
* **api:** api update ([9ebd84f](https://github.com/langchain-ai/langsmith-java/commit/9ebd84fe982b0a0304d1fcb7da168df0c97a043f))
* **api:** api update ([88bd850](https://github.com/langchain-ai/langsmith-java/commit/88bd85062b8c87a72f96d6fbac738963c1df562e))
* **api:** api update ([af7bf93](https://github.com/langchain-ai/langsmith-java/commit/af7bf93c5b285d509484c5f8cb838583dd0ed7e8))
* **api:** manual updates ([3f1d46e](https://github.com/langchain-ai/langsmith-java/commit/3f1d46e06a3616cb5fa22f3f89d13a0ff871c6c3))
* **api:** manual updates ([2ac51c9](https://github.com/langchain-ai/langsmith-java/commit/2ac51c9075348a4fd8e38dace4911d8a6bee2000))
* **api:** manual updates ([187c87f](https://github.com/langchain-ai/langsmith-java/commit/187c87f96a08b4c197b37232081c38797b8d59cc))
* **api:** manual updates ([5e0db72](https://github.com/langchain-ai/langsmith-java/commit/5e0db72d55d10c512dc0b0d4997968d2382dc32d))
* **api:** manual updates ([6bc9970](https://github.com/langchain-ai/langsmith-java/commit/6bc9970850b2ce9206eefa770c9e4e8164487745))
* **client:** add connection pooling option ([9acbf93](https://github.com/langchain-ai/langsmith-java/commit/9acbf9334972d4ff5d00caa346e3907ded7d3a72))
* **client:** add more convenience service method overloads ([fba86c8](https://github.com/langchain-ai/langsmith-java/commit/fba86c83fdbe3ad353ec9a5db065464ac0928e55))


### Chores

* **api:** minor updates ([5561ef0](https://github.com/langchain-ai/langsmith-java/commit/5561ef0a24492e78eab34609a48da09aa37496a1))
* **ci:** upgrade `actions/github-script` ([f758afb](https://github.com/langchain-ai/langsmith-java/commit/f758afb6d78e7ac01b085403f89ec33dbb0caa6c))
* **internal:** allow passing args to `./scripts/test` ([206af30](https://github.com/langchain-ai/langsmith-java/commit/206af3009b966f77ad4aec77a975b38ebafbbbde))
* **internal:** make `OkHttp` constructor internal ([b55c1e8](https://github.com/langchain-ai/langsmith-java/commit/b55c1e8e15bbb1c370ab4d8b4713d37965b2f4db))
* **internal:** remove mock server code ([f72c72d](https://github.com/langchain-ai/langsmith-java/commit/f72c72d36f8c390bfbcbd14cdf25cf25d8131a7f))
* **internal:** update `TestServerExtension` comment ([c4956f5](https://github.com/langchain-ai/langsmith-java/commit/c4956f59bae794a6da689eb891ed329ad6bac082))
* **internal:** upgrade AssertJ ([2535a3a](https://github.com/langchain-ai/langsmith-java/commit/2535a3ab58df98b740bee627f7fecd0f88adb05c))
* refactor ([#90](https://github.com/langchain-ai/langsmith-java/issues/90)) ([1902c22](https://github.com/langchain-ai/langsmith-java/commit/1902c228ddd2b4ddcc5b741bf7c67f250ae9da06))
* update mock server docs ([1704b40](https://github.com/langchain-ai/langsmith-java/commit/1704b408f7fe5af7ee8fa322f037a37749e22d05))

## 0.1.0-alpha.22 (2026-01-23)

Full Changelog: [v0.1.0-alpha.21...v0.1.0-alpha.22](https://github.com/langchain-ai/langsmith-java/compare/v0.1.0-alpha.21...v0.1.0-alpha.22)

### Features

* **api:** api update ([5fe36e6](https://github.com/langchain-ai/langsmith-java/commit/5fe36e66be0d8a4118d631794c5f70f443c88dac))
* **client:** send `X-Stainless-Kotlin-Version` header ([748e689](https://github.com/langchain-ai/langsmith-java/commit/748e6890d3560b3f373aa07031bc8b2e6fa288f8))


### Bug Fixes

* **client:** disallow coercion from float to int ([bc01e05](https://github.com/langchain-ai/langsmith-java/commit/bc01e05032fb90f0318bde2107978ccf93eaa330))
* **client:** fully respect max retries ([07ba637](https://github.com/langchain-ai/langsmith-java/commit/07ba63741949f3e159314c5556902e7a3fb93def))
* **client:** preserve time zone in lenient date-time parsing ([498395e](https://github.com/langchain-ai/langsmith-java/commit/498395ea719057dd6d5bbef7f38fc1206ffc6d04))
* **client:** send retry count header for max retries 0 ([07ba637](https://github.com/langchain-ai/langsmith-java/commit/07ba63741949f3e159314c5556902e7a3fb93def))
* date time deserialization leniency ([ac7a559](https://github.com/langchain-ai/langsmith-java/commit/ac7a559ad9704bac385a49c724b0d86704d0da4f))
* deserialization order ([71f380d](https://github.com/langchain-ai/langsmith-java/commit/71f380d5b09e54f6a0f0d2b703c2e3e2cc4e4766))


### Chores

* **ci:** upgrade `actions/setup-java` ([ee1ed58](https://github.com/langchain-ai/langsmith-java/commit/ee1ed58ada45c071662c61e700b473ee471660a1))
* **internal:** clean up maven repo artifact script and add html documentation to repo root ([85d8771](https://github.com/langchain-ai/langsmith-java/commit/85d877129ea7e78b889b4d28f6ea06bcefacfce1))
* **internal:** correct cache invalidation for `SKIP_MOCK_TESTS` ([1cd0cf2](https://github.com/langchain-ai/langsmith-java/commit/1cd0cf2d27d3c87c6196d1492a6c6a8b3562ba49))
* **internal:** depend on packages directly in example ([07ba637](https://github.com/langchain-ai/langsmith-java/commit/07ba63741949f3e159314c5556902e7a3fb93def))
* **internal:** improve maven repo docs ([d928145](https://github.com/langchain-ai/langsmith-java/commit/d92814500d00759eb188ab19bfc036b90022c782))
* **internal:** update `actions/checkout` version ([70785ca](https://github.com/langchain-ai/langsmith-java/commit/70785ca2b98445faebb66ef7a54223d5b3ea9e31))
* **internal:** update maven repo doc to include authentication ([2900175](https://github.com/langchain-ai/langsmith-java/commit/29001754d9b523a9bdb76a7c9650991284fbb761))
* test on Jackson 2.14.0 to avoid encountering FasterXML/jackson-databind[#3240](https://github.com/langchain-ai/langsmith-java/issues/3240) in tests ([ac7a559](https://github.com/langchain-ai/langsmith-java/commit/ac7a559ad9704bac385a49c724b0d86704d0da4f))


### Documentation

* add comment for arbitrary value fields ([642227b](https://github.com/langchain-ai/langsmith-java/commit/642227ba6b07a16d3f3287f585077afbc2684573))

## 0.1.0-alpha.21 (2026-01-14)

Full Changelog: [v0.1.0-alpha.20...v0.1.0-alpha.21](https://github.com/langchain-ai/langsmith-java/compare/v0.1.0-alpha.20...v0.1.0-alpha.21)

### Features

* **api:** api update ([d5e92e1](https://github.com/langchain-ai/langsmith-java/commit/d5e92e102d1dd770ae1205dc52d5d7f0a0692dcb))
* **api:** api update ([591546c](https://github.com/langchain-ai/langsmith-java/commit/591546c935e7e10e9521310870af83c8bd67ebd4))
* **api:** api update ([440ea8a](https://github.com/langchain-ai/langsmith-java/commit/440ea8abf0a22148c636f06f5a4c778e20b947e9))
* **api:** manual updates ([ee36c44](https://github.com/langchain-ai/langsmith-java/commit/ee36c44834da0d371168b876b7f9619c281f749e))


### Chores

* **internal:** support uploading Maven repo artifacts to stainless package server ([d1b01b9](https://github.com/langchain-ai/langsmith-java/commit/d1b01b9073fc2db7643fa07de2d421088218f4a3))

## 0.1.0-alpha.20 (2026-01-12)

Full Changelog: [v0.1.0-alpha.19...v0.1.0-alpha.20](https://github.com/langchain-ai/langsmith-java/compare/v0.1.0-alpha.19...v0.1.0-alpha.20)

### Features

* **api:** api update ([4b197f0](https://github.com/langchain-ai/langsmith-java/commit/4b197f03e8a2d7658d2e268d854114398429f7a9))
* **api:** api update ([5703f0f](https://github.com/langchain-ai/langsmith-java/commit/5703f0f838d16543a4c518dc108065d4e72e58b6))
* **api:** api update ([e2e98b7](https://github.com/langchain-ai/langsmith-java/commit/e2e98b7e9ab23ea0298e79cfc38a49797db0e978))
* **api:** api update ([96a6948](https://github.com/langchain-ai/langsmith-java/commit/96a69483bf3e39b21a65dfb1af1eea6914939dfa))
* **api:** api update ([8895f35](https://github.com/langchain-ai/langsmith-java/commit/8895f3571aafdffce373dac1052a4f26fd38347d))
* **api:** api update ([9c66288](https://github.com/langchain-ai/langsmith-java/commit/9c66288568aceb6d7b77b8742dc34e132c122b66))
* **api:** api update ([f73c866](https://github.com/langchain-ai/langsmith-java/commit/f73c86620f221064be73d86d9ce540f4e8aeb5c6))
* **client:** add `HttpRequest#url()` method ([7c51e6a](https://github.com/langchain-ai/langsmith-java/commit/7c51e6a7139f20c181bc4349c247da8aaa151a89))
* **client:** allow configuring dispatcher executor service ([4a50a22](https://github.com/langchain-ai/langsmith-java/commit/4a50a22f62527d90e5584b9c805b34cfa8c0a7c8))

## 0.1.0-alpha.19 (2025-12-10)

Full Changelog: [v0.1.0-alpha.18...v0.1.0-alpha.19](https://github.com/langchain-ai/langsmith-java/compare/v0.1.0-alpha.18...v0.1.0-alpha.19)

### Features

* **api:** api update ([c0d8bec](https://github.com/langchain-ai/langsmith-java/commit/c0d8bec69c14c9300a39737092b4a29210d4df59))
* **api:** api update ([9a9d362](https://github.com/langchain-ai/langsmith-java/commit/9a9d362b6e509abc8257c4ff8d5f11911f3ca4c0))
* **api:** api update ([e27bc6f](https://github.com/langchain-ai/langsmith-java/commit/e27bc6fd053032d0597a5dc4f4d636bada559748))
* **api:** api update ([ae353d7](https://github.com/langchain-ai/langsmith-java/commit/ae353d775aa03a2f820c9d065f79528401963c2c))
* **api:** api update ([fdb6021](https://github.com/langchain-ai/langsmith-java/commit/fdb6021eb3de21d7e3930dfe9f99a943100118b2))
* **api:** api update ([da999c0](https://github.com/langchain-ai/langsmith-java/commit/da999c02267725a5d5c4fdbf17f9482ad5df638e))
* **api:** api update ([daa7b07](https://github.com/langchain-ai/langsmith-java/commit/daa7b07fa755ad0d1feb6f6b3370c3bb5ff3c049))
* **api:** api update ([4985a65](https://github.com/langchain-ai/langsmith-java/commit/4985a651acb592b38f4d94afda202a4ecddb6be2))
* **api:** manual updates ([9ff3976](https://github.com/langchain-ai/langsmith-java/commit/9ff39760388f6cf4e68945ce536a0dd92d4f84bf))
* **api:** manual updates ([aa705c4](https://github.com/langchain-ai/langsmith-java/commit/aa705c489b4a64d2815c5ceacde5161c7518afac))


### Bug Fixes

* **client:** cancel okhttp call when future cancelled ([89ab779](https://github.com/langchain-ai/langsmith-java/commit/89ab7791a8e27347610bbecea44867c5b991073b))
* fix trace input and output ([#83](https://github.com/langchain-ai/langsmith-java/issues/83)) ([7a64410](https://github.com/langchain-ai/langsmith-java/commit/7a644105f69db9d10064ba38c18ee294fc62f360))


### Chores

* **api:** delete index methods ([7e90f5f](https://github.com/langchain-ai/langsmith-java/commit/7e90f5f70e263458f594ce92ae9a7b1a29e81f85))


### Documentation

* remove `$` for better copy-pasteabality ([4163726](https://github.com/langchain-ai/langsmith-java/commit/4163726d6d496289f025006b9a03363caeb879c7))

## 0.1.0-alpha.18 (2025-12-09)

Full Changelog: [v0.1.0-alpha.17...v0.1.0-alpha.18](https://github.com/langchain-ai/langsmith-java/compare/v0.1.0-alpha.17...v0.1.0-alpha.18)

### Features

* **api:** add go target ([ff3556a](https://github.com/langchain-ai/langsmith-java/commit/ff3556a80ff2fc128c17d06cc78b366e27865239))
* **api:** api update ([9a1ad24](https://github.com/langchain-ai/langsmith-java/commit/9a1ad247305770017095b760fa59c49883f6d204))
* **api:** change paginated retrieve methods to list ([229ed3e](https://github.com/langchain-ai/langsmith-java/commit/229ed3e0214e1d73cd81e05e118f5f6c7be670a7))
* **api:** pagination ([bd22dc6](https://github.com/langchain-ai/langsmith-java/commit/bd22dc6238f748edb0f0f70214f1a60b9087b525))
* **api:** pagination read me ([eccc183](https://github.com/langchain-ai/langsmith-java/commit/eccc183d0ec53b8b06122598daadafd707e28be3))
* **api:** readme example - change REPLACE_ME session_id to uuid ([a12609a](https://github.com/langchain-ai/langsmith-java/commit/a12609a69ae1d7d45a75f3032c74dc8a16c49242))
* method counter in ci ([8bb864e](https://github.com/langchain-ai/langsmith-java/commit/8bb864eaeccd46cb8153836e7b25ccfb1ba79838))


### Bug Fixes

* formatting error in record experiment example ([#81](https://github.com/langchain-ai/langsmith-java/issues/81)) ([243e318](https://github.com/langchain-ai/langsmith-java/commit/243e318f8defffda4b4116a8e2728c75f341dea7))


### Chores

* **internal:** version bump ([dcfaf78](https://github.com/langchain-ai/langsmith-java/commit/dcfaf785e20ada8e5c967a324aa23c9aa008372c))

## 0.1.0-alpha.17 (2025-11-20)

Full Changelog: [v0.1.0-alpha.16...v0.1.0-alpha.17](https://github.com/langchain-ai/langsmith-java/compare/v0.1.0-alpha.16...v0.1.0-alpha.17)

### Chores

* Configure workflow for CodeQL ([f0b024d](https://github.com/langchain-ai/langsmith-java/commit/f0b024dde59c5aab9c1da151061342d2586fe882))

## 0.1.0-alpha.16 (2025-11-20)

Full Changelog: [v0.1.0-alpha.15...v0.1.0-alpha.16](https://github.com/langchain-ai/langsmith-java/compare/v0.1.0-alpha.15...v0.1.0-alpha.16)

### Chores

* Update runner to ubuntu-latest-l-oss for Sonatype Publish ([5597676](https://github.com/langchain-ai/langsmith-java/commit/5597676151b5bd30087dcca93ae13f0e69714a16))

## 0.1.0-alpha.15 (2025-11-20)

Full Changelog: [v0.1.0-alpha.14...v0.1.0-alpha.15](https://github.com/langchain-ai/langsmith-java/compare/v0.1.0-alpha.14...v0.1.0-alpha.15)

## 0.1.0-alpha.14 (2025-11-20)

Full Changelog: [v0.1.0-alpha.13...v0.1.0-alpha.14](https://github.com/langchain-ai/langsmith-java/compare/v0.1.0-alpha.13...v0.1.0-alpha.14)

### Chores

* Update support portal link ([6a36fa7](https://github.com/langchain-ai/langsmith-java/commit/6a36fa7802d64d0fa0e3dc8f7f4958c2d9763f6c))

## 0.1.0-alpha.13 (2025-11-20)

Full Changelog: [v0.1.0-alpha.12...v0.1.0-alpha.13](https://github.com/langchain-ai/langsmith-java/compare/v0.1.0-alpha.12...v0.1.0-alpha.13)

### Features

* **api:** add rate limiting ([51fa6d7](https://github.com/langchain-ai/langsmith-java/commit/51fa6d7ec24088d1f5e4f7d64afa8b84ec0f32e1))
* **api:** Update contact email ([20a193d](https://github.com/langchain-ai/langsmith-java/commit/20a193d472fb6ba20d990852e7d116b7d688e9cb))
* **api:** Update docs to https://docs.smith.langchain.com/ ([f741f44](https://github.com/langchain-ai/langsmith-java/commit/f741f4487be9e79a4062bcb4e25f8605c2b6159c))

## 0.1.0-alpha.12 (2025-11-19)

Full Changelog: [v0.1.0-alpha.11...v0.1.0-alpha.12](https://github.com/langchain-ai/langsmith-java/compare/v0.1.0-alpha.11...v0.1.0-alpha.12)

### Features

* **api:** Set targets.java.publish.docs: true ([aec9261](https://github.com/langchain-ai/langsmith-java/commit/aec9261033ddb4a438e0bd409e96c2cb0c056471))


### Chores

* Move runner to ubuntu-latest-l to allow dokka to complete javadoc building ([05a9c63](https://github.com/langchain-ai/langsmith-java/commit/05a9c630d30918370524825769f9779a5925e9a3))

## 0.1.0-alpha.11 (2025-11-19)

Full Changelog: [v0.1.0-alpha.10...v0.1.0-alpha.11](https://github.com/langchain-ai/langsmith-java/compare/v0.1.0-alpha.10...v0.1.0-alpha.11)

### Features

* **api:** manual updates ([ceb4b70](https://github.com/langchain-ai/langsmith-java/commit/ceb4b70fb237b062479a82a33fd573282bc78ddd))
* **api:** manual updates ([5a26524](https://github.com/langchain-ai/langsmith-java/commit/5a265242c4eff81d3643a734694552a7002601c9))
* **api:** manual updates ([67d1fe5](https://github.com/langchain-ai/langsmith-java/commit/67d1fe57ad07a4501cc28d02e120e2cfaa571795))
* **api:** manual updates ([d0fe06d](https://github.com/langchain-ai/langsmith-java/commit/d0fe06d96b20eeb85102be4a27c3c4ff12d3f8bd))


### Bug Fixes

* ls playground errors & commit builder class ([3a6084e](https://github.com/langchain-ai/langsmith-java/commit/3a6084e3eb070030f42d5e7f255559c39f0c5c18))


### Chores

* Update/simplify README leading example ([1357414](https://github.com/langchain-ai/langsmith-java/commit/1357414326b7ff316364ebcfa4f03c6f07327c8a))

## 0.1.0-alpha.10 (2025-11-17)

Full Changelog: [v0.1.0-alpha.9...v0.1.0-alpha.10](https://github.com/langchain-ai/langsmith-java/compare/v0.1.0-alpha.9...v0.1.0-alpha.10)

### Features

* **api:** api update ([09fe76d](https://github.com/langchain-ai/langsmith-java/commit/09fe76d418f4d0adff2539db4e76abd950e1b1ba))
* **api:** api update ([3800b92](https://github.com/langchain-ai/langsmith-java/commit/3800b92761f1e238c9f76e8df2cabaed186a4eca))
* **api:** api update ([df4d45b](https://github.com/langchain-ai/langsmith-java/commit/df4d45b2319a20eef3938a6c065423a8d458c7df))
* **api:** enable post /runs/batch ([38a4268](https://github.com/langchain-ai/langsmith-java/commit/38a4268c565bc27b59b0a7bd7145888c1f7e51af))
* **api:** manual updates ([8e76b0d](https://github.com/langchain-ai/langsmith-java/commit/8e76b0d513e52007da90b9c8482203481b1753f6))
* **api:** switch license to MIT ([fb7fc1f](https://github.com/langchain-ai/langsmith-java/commit/fb7fc1f29d4bdd6e0a6b8fb743af3cd195c08fcc))


### Bug Fixes

* **client:** multi-value header serialization ([c477835](https://github.com/langchain-ai/langsmith-java/commit/c477835e95825176bc659da0c0a42714863fb308))
* lint ([91f5b8e](https://github.com/langchain-ai/langsmith-java/commit/91f5b8e78493a421a1c60351c7a6ef556f47fdcb))


### Chores

* align env vars with other SDKs ([ba82822](https://github.com/langchain-ai/langsmith-java/commit/ba8282230cf48fa04b9277d41128909d9c18cbc4))
* combine otel examples ([a2074ab](https://github.com/langchain-ai/langsmith-java/commit/a2074ab7b1346d8a9f0ccfae947ebeaf3b7bab55))
* convert to kotlin ([875050c](https://github.com/langchain-ai/langsmith-java/commit/875050c7524511a14a82f4e741625aeea5fe50a9))


### Refactors

* ExperimentContext to use OpenTelemetry Context pattern ([def5492](https://github.com/langchain-ai/langsmith-java/commit/def549215491cb5cf46db9f132c902388865f536))
* migrate to SLF4J logging and Builder-only API ([02cc2f3](https://github.com/langchain-ai/langsmith-java/commit/02cc2f35a2e12446a1f0874ed0d3053f755b506d))

## 0.1.0-alpha.9 (2025-11-11)

Full Changelog: [v0.1.0-alpha.8...v0.1.0-alpha.9](https://github.com/langchain-ai/langsmith-java/compare/v0.1.0-alpha.8...v0.1.0-alpha.9)

### Features

* added otel ingestion examples and code ([19c2cf5](https://github.com/langchain-ai/langsmith-java/commit/19c2cf595acfa19196b3ecf8726b1e888d5f6a17))
* **api:** api update ([284d184](https://github.com/langchain-ai/langsmith-java/commit/284d1843164d9803354e56220f436264743ea76d))


### Bug Fixes

* added back the stdin build config ([866970e](https://github.com/langchain-ai/langsmith-java/commit/866970e8e06c575564bfb0f33bd2ab9197ff16f0))
* lint fix ([16f01c8](https://github.com/langchain-ai/langsmith-java/commit/16f01c8edb0fcac9ab71882842daee252ae4198d))
* lint fix ([cd244b3](https://github.com/langchain-ai/langsmith-java/commit/cd244b3fe9fcc55ec53b4a66e8113cba77932212))
* lint, build, test ([21969a6](https://github.com/langchain-ai/langsmith-java/commit/21969a61f9e31dbd3b75e372795bc5960139486c))

## 0.1.0-alpha.8 (2025-11-10)

Full Changelog: [v0.1.0-alpha.7...v0.1.0-alpha.8](https://github.com/langchain-ai/langsmith-java/compare/v0.1.0-alpha.7...v0.1.0-alpha.8)

### Features

* **api:** enable /api/v1/runs/query ([1967627](https://github.com/langchain-ai/langsmith-java/commit/1967627dd49bf1e4855c9b25a50ff8a40de65b61))
* **api:** enable /examples ([02d5b72](https://github.com/langchain-ai/langsmith-java/commit/02d5b724decd2cbbcc3e808f45b3fddbe3c6cce6))
* **api:** manual updates ([ff1d89a](https://github.com/langchain-ai/langsmith-java/commit/ff1d89a0bb9bbbf0096c8e75ca905a30a3e4324f))
* **api:** manual updates ([1c57a55](https://github.com/langchain-ai/langsmith-java/commit/1c57a55b2e0d0ead4bc48366478a933fb5e4c42c))


### Bug Fixes

* **api:** rename DataType to DatasetDataType ([494e91b](https://github.com/langchain-ai/langsmith-java/commit/494e91bba27677d2e19c70a96ee2cc69edf66539))
* DatasetDataType name ([1160c21](https://github.com/langchain-ai/langsmith-java/commit/1160c21dba6620792e25a83e6279583f5c1aed50))
* remove experiment_view_overrides ([43ffea3](https://github.com/langchain-ai/langsmith-java/commit/43ffea37a2b9051f136603dd8779d179439884e8))
* rename query param dataType to datatype ([9b596ec](https://github.com/langchain-ai/langsmith-java/commit/9b596ec763d1b3e93802a5579190a27c150944cd))

## 0.1.0-alpha.7 (2025-11-10)

Full Changelog: [v0.1.0-alpha.6...v0.1.0-alpha.7](https://github.com/langchain-ai/langsmith-java/compare/v0.1.0-alpha.6...v0.1.0-alpha.7)

### Features

* **api:** api update ([524a19f](https://github.com/langchain-ai/langsmith-java/commit/524a19f4de68c8936cd5995a90491061710f2a5e))
* **api:** manual updates ([9d61b1d](https://github.com/langchain-ai/langsmith-java/commit/9d61b1d041a599d547bb734f63cd8021ed3f6154))
* **api:** manual updates ([91e9267](https://github.com/langchain-ai/langsmith-java/commit/91e9267c8dc7291ab5263b98c86df6467ca08b07))
* **api:** manual updates ([5f71223](https://github.com/langchain-ai/langsmith-java/commit/5f71223bac2a797dd1da9d3aaa8d6e94f3f6c685))


### Chores

* Move LangSmith OTel Java wrappers PoC into SDK ([24680be](https://github.com/langchain-ai/langsmith-java/commit/24680beb2f50ab99332fb8fcd55ca6e50890e8d1))

## 0.1.0-alpha.6 (2025-11-07)

Full Changelog: [v0.1.0-alpha.5...v0.1.0-alpha.6](https://github.com/langchain-ai/langsmith-java/compare/v0.1.0-alpha.5...v0.1.0-alpha.6)

### Features

* **api:** api update ([3e0c4b8](https://github.com/langchain-ai/langsmith-java/commit/3e0c4b89d919ab48138fe8cc6dd3186fc543b1a1))
* **api:** manual updates ([3da5f28](https://github.com/langchain-ai/langsmith-java/commit/3da5f2870ce7a0aaab2bd8cd2363cdcbd3604fec))
* **api:** remove some endpoints ([b4e170d](https://github.com/langchain-ai/langsmith-java/commit/b4e170da648e42bcd936f315c21b7ca0739277a1))
* **api:** removing methods ([a5dc27e](https://github.com/langchain-ai/langsmith-java/commit/a5dc27ed22ec46dcfaa708318ba41bedb70742b2))


### Chores

* revert from SH to public GH runner ([0d00830](https://github.com/langchain-ai/langsmith-java/commit/0d00830db9c921154d9613b1a09e4324fe2a3795))

## 0.1.0-alpha.5 (2025-11-07)

Full Changelog: [v0.1.0-alpha.4...v0.1.0-alpha.5](https://github.com/langchain-ai/langsmith-java/compare/v0.1.0-alpha.4...v0.1.0-alpha.5)

### Bug Fixes

* **api:** ignore /api/v1/runs/stats ([77433e6](https://github.com/langchain-ai/langsmith-java/commit/77433e67052b14b77d4f87dd3f2bf85d43625217))

## 0.1.0-alpha.4 (2025-11-06)

Full Changelog: [v0.1.0-alpha.3...v0.1.0-alpha.4](https://github.com/langchain-ai/langsmith-java/compare/v0.1.0-alpha.3...v0.1.0-alpha.4)

### Features

* **api:** api update ([1d38234](https://github.com/langchain-ai/langsmith-java/commit/1d382347b2bc40d0fc5c408a2d210d5a8b7b04ee))
* **api:** disabling charts and org-charts ([9513b86](https://github.com/langchain-ai/langsmith-java/commit/9513b866e94bcbc1feccbf993a7d858399b9836c))


### Bug Fixes

* **api:** disable /api/v1/repos/optimize-job ([48b96d6](https://github.com/langchain-ai/langsmith-java/commit/48b96d6df48665af0abba2480f0e91d5811c8267))
* **api:** disable optimization-jobs ([945edb4](https://github.com/langchain-ai/langsmith-java/commit/945edb47b4bc0fa82c2dbd7a629e51db43254579))
* **api:** excluding post /api/v1/prompts* ([e1a0439](https://github.com/langchain-ai/langsmith-java/commit/e1a0439908c777b281d2a6b91cbf8bfcb35afa4c))
* **api:** Rename RunRules*.transient for java target ([ea54d5a](https://github.com/langchain-ai/langsmith-java/commit/ea54d5a1a04e8b9ad6b1f80b18cb7e65a0dbc3e1))


### Chores

* disable javadocs ([0f8c477](https://github.com/langchain-ai/langsmith-java/commit/0f8c477a271c4e7771d56778f6aebcf7dc03d29e))

## 0.1.0-alpha.3 (2025-11-05)

Full Changelog: [v0.1.0...v0.1.0-alpha.3](https://github.com/langchain-ai/langsmith-java/compare/v0.1.0...v0.1.0-alpha.3)

### Features

* **api:** manual updates ([70bfdc0](https://github.com/langchain-ai/langsmith-java/commit/70bfdc0d4727e693fc60dc16b0b5c54f9ad0809a))
* **api:** manual updates ([ba17bc4](https://github.com/langchain-ai/langsmith-java/commit/ba17bc456030005106645000aaf3b6f69910587a))

## 0.1.0 (2025-11-05)

Full Changelog: [v0.0.1...v0.1.0](https://github.com/langchain-ai/langsmith-java/compare/v0.0.1...v0.1.0)

### Features

* **api:** update via SDK Studio ([d566db8](https://github.com/langchain-ai/langsmith-java/commit/d566db885648aceb59f329a8d0c9a55dffa4d56f))
* **api:** update via SDK Studio ([3b95796](https://github.com/langchain-ai/langsmith-java/commit/3b957961949fd4cafb9e300e59ad70c9323b5606))
* **api:** update via SDK Studio ([1121516](https://github.com/langchain-ai/langsmith-java/commit/1121516e4d26dc87b382b178bed2ad5a4e19c9bb))
* **api:** update via SDK Studio ([2443989](https://github.com/langchain-ai/langsmith-java/commit/2443989306c07abb715cfd56fa7233d990f65abe))
* **api:** update via SDK Studio ([154d8b6](https://github.com/langchain-ai/langsmith-java/commit/154d8b618d9a24d3244886c7a37eed727bc78056))
* **api:** update via SDK Studio ([9afbcab](https://github.com/langchain-ai/langsmith-java/commit/9afbcabf447707add64d587a7a25577570c6ea50))
* **api:** update via SDK Studio ([bad726a](https://github.com/langchain-ai/langsmith-java/commit/bad726a369361b69a24921fbee842e7c6449ff33))
* **api:** update via SDK Studio ([08ff898](https://github.com/langchain-ai/langsmith-java/commit/08ff89828ff62ed36e823cda514c96f56301f514))
* **api:** update via SDK Studio ([515bd12](https://github.com/langchain-ai/langsmith-java/commit/515bd1264635b7a6ff5fca43b4736d23a3243c00))
* **api:** update via SDK Studio ([ccaa939](https://github.com/langchain-ai/langsmith-java/commit/ccaa939ba9e47eccefbffb94a0a320c99a742e27))
* **api:** update via SDK Studio ([#10](https://github.com/langchain-ai/langsmith-java/issues/10)) ([8ce42d0](https://github.com/langchain-ai/langsmith-java/commit/8ce42d0d86b9eb2316323ecf5883060c3be6569b))
* **api:** update via SDK Studio ([#11](https://github.com/langchain-ai/langsmith-java/issues/11)) ([2a9fe2b](https://github.com/langchain-ai/langsmith-java/commit/2a9fe2b42e22ca023024900a3145c90f7f70876b))
* **api:** update via SDK Studio ([#13](https://github.com/langchain-ai/langsmith-java/issues/13)) ([db65132](https://github.com/langchain-ai/langsmith-java/commit/db651329e510afa7b4cbee0471d05f08bb7468c4))
* **api:** update via SDK Studio ([#14](https://github.com/langchain-ai/langsmith-java/issues/14)) ([79999bf](https://github.com/langchain-ai/langsmith-java/commit/79999bf54207e7c7ba190a30fee341c85f69e870))
* **api:** update via SDK Studio ([#15](https://github.com/langchain-ai/langsmith-java/issues/15)) ([134c022](https://github.com/langchain-ai/langsmith-java/commit/134c02266d7d774603ac604bb2e1138375a7679c))
* **api:** update via SDK Studio ([#16](https://github.com/langchain-ai/langsmith-java/issues/16)) ([7953ae0](https://github.com/langchain-ai/langsmith-java/commit/7953ae06de08e9362116f0c2d1a2daed89745a94))
* **api:** update via SDK Studio ([#17](https://github.com/langchain-ai/langsmith-java/issues/17)) ([8b462e1](https://github.com/langchain-ai/langsmith-java/commit/8b462e174e8bb482b7bfeecd3903b4caa0a76d97))
* **api:** update via SDK Studio ([#18](https://github.com/langchain-ai/langsmith-java/issues/18)) ([0ffa490](https://github.com/langchain-ai/langsmith-java/commit/0ffa490540523665467616d78ad0c11abcd596e3))
* **api:** update via SDK Studio ([#19](https://github.com/langchain-ai/langsmith-java/issues/19)) ([36e65ef](https://github.com/langchain-ai/langsmith-java/commit/36e65eff30b737df79f0309110cfb3fd31ad201e))
* **api:** update via SDK Studio ([#2](https://github.com/langchain-ai/langsmith-java/issues/2)) ([55c5994](https://github.com/langchain-ai/langsmith-java/commit/55c59946bba5240076888bc5dbc106b7c6e79e12))
* **api:** update via SDK Studio ([#20](https://github.com/langchain-ai/langsmith-java/issues/20)) ([6014dab](https://github.com/langchain-ai/langsmith-java/commit/6014dab0bb0cb252601045f886ab82f9ab486e8f))
* **api:** update via SDK Studio ([#21](https://github.com/langchain-ai/langsmith-java/issues/21)) ([d33b9aa](https://github.com/langchain-ai/langsmith-java/commit/d33b9aab8a15e89c204841d4bc2393a79821322b))
* **api:** update via SDK Studio ([#22](https://github.com/langchain-ai/langsmith-java/issues/22)) ([8842ad7](https://github.com/langchain-ai/langsmith-java/commit/8842ad7d4c77ba34732bc35a46b9691e4e96f27a))
* **api:** update via SDK Studio ([#23](https://github.com/langchain-ai/langsmith-java/issues/23)) ([bfc1bfe](https://github.com/langchain-ai/langsmith-java/commit/bfc1bfe92bb196d2dd144249ead8c630f5c22617))
* **api:** update via SDK Studio ([#24](https://github.com/langchain-ai/langsmith-java/issues/24)) ([c34959c](https://github.com/langchain-ai/langsmith-java/commit/c34959c24e720c97e7f217a809d8757722a29e0f))
* **api:** update via SDK Studio ([#25](https://github.com/langchain-ai/langsmith-java/issues/25)) ([18b3218](https://github.com/langchain-ai/langsmith-java/commit/18b32186ba51625597553c92acd28afa93d0daed))
* **api:** update via SDK Studio ([#26](https://github.com/langchain-ai/langsmith-java/issues/26)) ([a098ba3](https://github.com/langchain-ai/langsmith-java/commit/a098ba3e9cc1fe064c4d09d7d177814111d86668))
* **api:** update via SDK Studio ([#3](https://github.com/langchain-ai/langsmith-java/issues/3)) ([8f2c165](https://github.com/langchain-ai/langsmith-java/commit/8f2c1656243229dade53d1982b03776cd7dd1f54))
* **api:** update via SDK Studio ([#4](https://github.com/langchain-ai/langsmith-java/issues/4)) ([eb9f2ca](https://github.com/langchain-ai/langsmith-java/commit/eb9f2caa19bb047ad95d9735ce2978ed1b8de899))
* **api:** update via SDK Studio ([#5](https://github.com/langchain-ai/langsmith-java/issues/5)) ([6e2732b](https://github.com/langchain-ai/langsmith-java/commit/6e2732b4ddeefc1ef99e0b99632416e51407fa20))
* **api:** update via SDK Studio ([#6](https://github.com/langchain-ai/langsmith-java/issues/6)) ([66e3914](https://github.com/langchain-ai/langsmith-java/commit/66e39143b6a7dad335693155e059741e97f058d7))
* **api:** update via SDK Studio ([#7](https://github.com/langchain-ai/langsmith-java/issues/7)) ([42ad6b5](https://github.com/langchain-ai/langsmith-java/commit/42ad6b588e1fa6c628087a9efbe0671c715ce335))
* **api:** update via SDK Studio ([#8](https://github.com/langchain-ai/langsmith-java/issues/8)) ([1bfd5c1](https://github.com/langchain-ai/langsmith-java/commit/1bfd5c116543972511d514694a2b2b252e384739))
* **api:** update via SDK Studio ([#9](https://github.com/langchain-ai/langsmith-java/issues/9)) ([96d933d](https://github.com/langchain-ai/langsmith-java/commit/96d933d654b0b08bd091a5581b6b35dfa80fdc58))
* do not inline example ([fa22fd7](https://github.com/langchain-ai/langsmith-java/commit/fa22fd702baaaaa6c1062c73571360210a63de5c))
* fix link ([c6b8b73](https://github.com/langchain-ai/langsmith-java/commit/c6b8b737b6214b717f747002f4f5f314ebce7fbb))
* Restore custom updates ([503e992](https://github.com/langchain-ai/langsmith-java/commit/503e9927dc4d1bdabd9e0f48914d73c571719cd3))
* update builder patterns, use end options ([33019db](https://github.com/langchain-ai/langsmith-java/commit/33019db58bbbb63590dacbecd60548ea3f76ebd3))
* update README ([aa6b46d](https://github.com/langchain-ai/langsmith-java/commit/aa6b46d44f8f7b15d342d7bb4defc566fd6f5369))
* update via SDK Studio ([f66201a](https://github.com/langchain-ai/langsmith-java/commit/f66201ace3eadfb8f32d2e12eea8d83282713bbe))
* update via SDK Studio ([89fada3](https://github.com/langchain-ai/langsmith-java/commit/89fada3e45d37a8e81af6c2a5ef840bb7e67dead))
* update via SDK Studio ([df821a5](https://github.com/langchain-ai/langsmith-java/commit/df821a56cce19ffb53067585f482ccfb7ba8d437))
* update via SDK Studio ([ba80991](https://github.com/langchain-ai/langsmith-java/commit/ba809915e0ef257e4c06cdd81444cb5c93923cb5))
* update via SDK Studio ([146e79a](https://github.com/langchain-ai/langsmith-java/commit/146e79a492f1c6cd07fea0a4ef4ee9332384d8ad))
* update via SDK Studio ([0b6cc83](https://github.com/langchain-ai/langsmith-java/commit/0b6cc8326488e43db529266b8fa5183f4333e9fb))
* update via SDK Studio ([4f2d659](https://github.com/langchain-ai/langsmith-java/commit/4f2d659cf1a73ecc2539467fce4bd00930e59320))
* update via SDK Studio ([db11c5d](https://github.com/langchain-ai/langsmith-java/commit/db11c5dd9941ae2e1ff5e3620b325f5d9d18c1df))
* update via SDK Studio ([77b0683](https://github.com/langchain-ai/langsmith-java/commit/77b0683841856eddaeb433c948481809a60a1ea0))
* update via SDK Studio ([c447f29](https://github.com/langchain-ai/langsmith-java/commit/c447f2976db0d5deccce82a1fcccc91cc5072397))
* update via SDK Studio ([3e3cf2a](https://github.com/langchain-ai/langsmith-java/commit/3e3cf2aa5a0b014951c1c3c27da59f5e3414aa11))
* update via SDK Studio ([9ae290c](https://github.com/langchain-ai/langsmith-java/commit/9ae290cfef922c77d75a60aecd7270dee313aeea))
* update via SDK Studio ([ea990f2](https://github.com/langchain-ai/langsmith-java/commit/ea990f2c94faedb8241161907f6736b7eb96f553))
* update via SDK Studio ([5809aaf](https://github.com/langchain-ai/langsmith-java/commit/5809aaf7b39fd3fe6ccecb5ad21c38f89c2eed96))
* updates ([eb0044a](https://github.com/langchain-ai/langsmith-java/commit/eb0044a2a4b0d7f90e9842eb7fa53503d7c85232))
* Use new sonatype publishing plugin ([d3f8fb2](https://github.com/langchain-ai/langsmith-java/commit/d3f8fb2c0931c78f9a830b3fd4d0a398e5c481f1))


### Bug Fixes

* remove outdated directories ([e2ac9ba](https://github.com/langchain-ai/langsmith-java/commit/e2ac9ba0531d06420d3517e28aca84975446b222))
* rename example directory directory ([6225cca](https://github.com/langchain-ai/langsmith-java/commit/6225ccac5a6fac48c2fc4bb637a76b01579e4a6b))


### Chores

* **docs:** update readme headline ([7cc251a](https://github.com/langchain-ai/langsmith-java/commit/7cc251affecbc6c316d6526ccfc95bb6288a2c8e))
* go live ([#1](https://github.com/langchain-ai/langsmith-java/issues/1)) ([2c86176](https://github.com/langchain-ai/langsmith-java/commit/2c86176ee0910ea2deabf3f55ef1f5e2dd46b522))
* rm -rf all to reset publishing from stainless ([aa5e0f7](https://github.com/langchain-ai/langsmith-java/commit/aa5e0f7de3196ef63fd3a942b5d8dcfafb432d53))
* sync repo ([9e876f6](https://github.com/langchain-ai/langsmith-java/commit/9e876f623d7e925554baac296b27b0db7eb29d29))
* update SDK settings ([61bfe11](https://github.com/langchain-ai/langsmith-java/commit/61bfe11f7c82eb3bc848e218cb81b435f0455935))
* use langsmith-java as Maven artifact id ([22881d9](https://github.com/langchain-ai/langsmith-java/commit/22881d97b2e4944818e02d62c0a35f0874ab4131))
