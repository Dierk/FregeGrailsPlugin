
eventCompileStart = {
  File srcDir = new File('src/frege')
  if (! srcDir.exists()) {
    println "No source directory 'src/frege' found. Frege compilation skipped."
    return
  }
  def srcFiles = ""
  int srcCount = 0
  srcDir.eachFileRecurse { file ->
	if (file.directory) return
	if (file.path.endsWith(".fr")) {
		srcFiles += " " + file.path
		srcCount++
	}
  }
  if (srcFiles=="") {
	println "No frege files dectected, skipping frege compile."
	return
  }
  println "Compiling $srcCount frege file" + (srcCount > 1 ? 's' : '') + "."
  ant.mkdir dir:classesDir.path // we will need that as a destination for the frege compiler
  def clazzpath = classesDir.path + File.pathSeparator + grailsSettings.compileDependencies.path.join(File.pathSeparator)
  def javaCmd = "java -classpath $clazzpath frege.compiler.Main -inline -make -d $classesDir.path -sp $srcDir.path $srcFiles"
  def initialSize = 4096
  def outStream = new ByteArrayOutputStream(initialSize)
  def errStream = new ByteArrayOutputStream(initialSize)
  def proc = javaCmd.execute()
  proc.consumeProcessOutput(outStream, errStream)
  proc.waitFor()
  // enable below for debugging
  // println '' + outStream
  println '' + errStream
  println "Frege compile end (${proc.exitValue()})."
}


