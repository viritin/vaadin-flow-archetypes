dir = new File(new File(request.outputDirectory), request.artifactId)

def run(String cmd) {
    def process = cmd.execute(null, dir)
    process.waitForProcessOutput((Appendable)System.out, System.err)
    if (process.exitValue() != 0) {
        throw new Exception("Command '$cmd' exited with code: ${process.exitValue()}")
    }
}

run("echo 'Updating to latest Vaadin version...'")
run("mvn versions:update-properties")

run("echo 'Updating to latest Spring Boot version...'")
run("mvn versions:update-parent")
