def call (String GithubURL) {
	"Cloning repository from: ${GithubURL}"
	#"git clone ${GithubURL}"
	git branch: 'main', url:${GithubURL}
}
