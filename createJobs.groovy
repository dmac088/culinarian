pipelineJob('pipelineJob') {
    definition {
        cps {
            script(readFileFromWorkspace('pipelineJob.groovy'))
            sandbox()
        }
    }
}
pipelineJob('theme-park-job') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/dmac088/ThemePark.git'
                    }
                    branch 'main'
                }
            }
        }
    }
}
pipelineJob('theme-park-job-docker') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/dmac088/ThemePark.git'
                    }
                    branch 'main'
                    scriptPath('Jenkinsfile-docker')
                }
            }
        }
    }
}
pipelineJob('sorbet-job') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/dmac088/Sorbet.git'
                    }
                    branch 'main'
                }
            }
        }
    }
}