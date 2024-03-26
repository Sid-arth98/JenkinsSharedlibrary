def call (String GithubURL) {
	echo "Cloning repository from: ${GithubURL}"
	"git clone ${GithubURL}"
}
