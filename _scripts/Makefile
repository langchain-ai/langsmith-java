.PHONY: all run clean

all: run

JAR_FILE = langsmith-traceable-0.0.1-alpha.0.jar
JAR_DIR = langsmith-traceable
# TARGET_CLASS = TestTraceable
# TARGET_CLASS = TestRunTree
TARGET_CLASS = RunOnDataset

$(JAR_FILE):
	@echo "Building jar file"
	cd ../ && ./gradlew build

run: $(JAR_FILE)
	@echo "Copying jar file"
	cp ../$(JAR_DIR)/build/libs/$(JAR_FILE) .
	@echo "Running TestClient"
	javac -cp $(JAR_FILE) $(TARGET_CLASS).java
	java -Dorg.aspectj.weaver.showWeaveInfo=true  -cp $(JAR_FILE):. $(TARGET_CLASS)

clean:
	rm -f *.jar *.class