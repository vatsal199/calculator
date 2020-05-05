node {

	def app

    	stage('Clone Repository') {
		steps{
			echo "Poolig git gepository..."
			git "https://github.com/gauravishaandixit/SPECalculator.git"
		}
		
    	}

    	stage('Clean') {
		steps{
			echo "Cleaning privious targets..."
			sh " mvn clean"
		}
		
    	}

    	stage('Validate') {
		steps{
			echo "Validating the project and Downloading dependecies..."
			sh " mvn validate"
		}
		
    	}

    	stage('Compile') {
		steps{
			echo "Compiling source code..."
			sh " mvn compile"
		}
		
    	}

    	stage('Test') {
		steps{
			echo "Testing project..."
			sh " mvn test"
		}
		
    	}

    	stage('Package') {
		steps{
			echo "Packaging the project and generating jars..."
			sh " mvn package"
		}
		
    	}

    	stage('Build Image') {
		steps{
			echo "Generating docker image..."
        		app = docker.build("vatsal199/calculator")
		}
    	}

    	stage('Push Image') {
		steps{
			echo "Uploading docker image to docker hub..."
			docker.withRegistry('https://registry.hub.docker.com', 'docker-hub-credentials') {
		    		app.push("${env.BUILD_NUMBER}")
		    		/*app.push("latest")*/
			}
		}
    	}
}
