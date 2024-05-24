def call (String ServiceName) {
	echo "Building ${ServiceName} image"
	sh "docker build -t siddharth/${ServiceName}:latest . "
}
