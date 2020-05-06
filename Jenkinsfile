node {

	    def app

    	stage('Clone Repository') {
			echo "Poolig git gepository..."
			git "https://github.com/vatsal199/calculator.git"
    	}

    	stage('Clean') {
			echo "Cleaning privious targets..."
			sh " mvn clean"
    	}

    	stage('Validate') {
			echo "Validating the project and Downloading dependecies..."
			sh " mvn validate"
    	}

    	stage('Compile') {
			echo "Compiling source code..."
			sh " mvn compile"
    	}

    	stage('Test') {
			echo "Testing project..."
			sh " mvn test"
    	}

    	stage('Package') {
			echo "Packaging the project and generating jars..."
			sh " mvn package"
    	}

    	stage('Build Image') {
			echo "Generating docker image..."
        	app = docker.build("vatsal199/calculator")
    	}

    	stage('Push Image') {
			echo "Uploading docker image to docker hub..."
			docker.withRegistry('https://registry.hub.docker.com', 'docker-hub-credentials') {
		    		app.push("${env.BUILD_NUMBER}")
		    		app.push("latest")
			}
    	}
}
