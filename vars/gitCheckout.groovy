
def call(Map stageParams) {
 
 //   checkout([
 //       $class: 'GitSCM',
 //       branches: [[name:  stageParams.branch ]],
//        userRemoteConfigs: [[ url: stageParams.url ]]
 //   ])
 
 checkout([
      $class: 'GitSCM', 
      branches: [[name: '*/master']], 
      doGenerateSubmoduleConfigurations: false, extensions: [], 
      submoduleCfg: [], 
      userRemoteConfigs: [[url: 'https://github.com/shary786/jenkins-shared-library-structure.git']]
 
 ])
 
 
  }
