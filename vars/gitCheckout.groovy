def call (String GithubURL) {
	"Cloning repository from: ${GithubURL}"
	git branch: 'main', url:${GithubURL}
}
