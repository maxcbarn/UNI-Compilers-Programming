JAVAC = javac
JAVA = java
JAR = jar

SRC_DIR = JavaCompiler
BIN_DIR = $(SRC_DIR)/classes
JAR_FILE = compiler.jar
MAIN = Compilador

SOURCES = $(wildcard $(SRC_DIR)/*.java)

.PHONY: all compile run clean

all: $(JAR_FILE)

compile:
	@mkdir -p $(BIN_DIR)
	$(JAVAC) -d $(BIN_DIR) $(SOURCES)

$(JAR_FILE): compile
	$(JAR) cfe $(JAR_FILE) $(MAIN) -C $(BIN_DIR) .

run: $(JAR_FILE)
	$(JAVA) -jar $(JAR_FILE)

clean:
	rm -rf $(BIN_DIR) $(JAR_FILE)s

pilha:
	mkdir -p $(BIN_DIR)
	javac -d $(BIN_DIR) $(SRC_DIR)/MaquinaDePilha.java
	jar cfe maquinaDePilha.jar MaquinaDePilha -C $(BIN_DIR) .