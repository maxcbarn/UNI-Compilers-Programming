JAVACC = javacc
JAVAC = javac
JAR = jar

SRC_DIR = classes
MAIN_CLASS = MiniKotlin
JAR_FILE = MiniKotlin.jar

SOURCES = $(wildcard $(SRC_DIR)/*.java)

.PHONY: all compile run clean

all: $(JAR_FILE)

$(SRC_DIR)/MiniKotlin.java: MiniKotlin.jj
	$(JAVACC) -OUTPUT_DIRECTORY=$(SRC_DIR) MiniKotlin.jj

compile: $(SRC_DIR)/MiniKotlin.java
	$(JAVAC) -d $(SRC_DIR) $(SOURCES)

$(JAR_FILE): compile
	$(JAR) cfe $(JAR_FILE) $(MAIN_CLASS) -C $(SRC_DIR) .

run: $(JAR_FILE)
	java -jar $(JAR_FILE)

clean:
	rm -f $(JAR_FILE)
	rm -f $(SRC_DIR)/*.class