def call (string GithubURL) {
	echo "Cloning repository from: ${GithubURL}"
	sh "git clone ${GithubURL}"
}