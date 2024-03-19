.PHONY: build

build:
	@echo "Building LangSmith"
# TODO: Use ./gradlew
	@SKIP_MOCK_TESTS=true ./gradlew build --stacktrace
