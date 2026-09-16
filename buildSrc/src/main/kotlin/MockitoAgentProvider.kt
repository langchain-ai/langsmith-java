import org.gradle.api.tasks.InputFiles
import org.gradle.api.tasks.PathSensitive
import org.gradle.api.tasks.PathSensitivity
import org.gradle.process.CommandLineArgumentProvider
import java.io.File

class MockitoAgentProvider(@get:InputFiles @get:PathSensitive(PathSensitivity.RELATIVE) val files: Iterable<File>) :
    CommandLineArgumentProvider {
    override fun asArguments(): Iterable<String> = files.map { "-javaagent:${it.absolutePath}" }
}
