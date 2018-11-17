all: clean build run view


view:
	sleep 5 && cat data/MyFile.txt

run:
	./run.sh 10

build:
	./build.sh

clean:
	rm -f data/MyFile.txt && touch data/MyFile.txt

.Phony:	clean build run view all
