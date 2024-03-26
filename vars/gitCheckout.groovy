def call (String GithubURL) {
	echo "Cloning repository from: ${GithubURL}"
	sh "git clone ${GithubURL}"
}
