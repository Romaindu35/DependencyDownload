/*import dev.vankka.dependencydownload.DependencyManager;
import dev.vankka.dependencydownload.dependency.StandardDependency;
import dev.vankka.dependencydownload.repository.StandardRepository;
import fr.flowarg.flowio.FileUtils;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class DependencyManagerTest {

    private static final Path EXECUTE_DIR = Paths.get("test_dir");

    private static final String json = "===ALGORITHM SHA-256 \n " +
            "dev.vankka.dependencydownload:common:1.1.4 4859108fa4501791f0261e8a9ecda10ad669dbf248e46df4473edeebf6b9c464\n" +
            "dev.vankka.dependencydownload:runtime:1.1.4 d6f83a434aefcde6877941ccf6fd6bee839b3135eb56af107147a6e43d6883d2";

    @BeforeEach
    public void before() throws Exception
    {
        FileUtils.deleteDirectory(EXECUTE_DIR);
        Files.createDirectory(EXECUTE_DIR);
    }

    @AfterAll
    public static void after() throws Exception
    {
        FileUtils.deleteDirectory(EXECUTE_DIR);
    }

    @Order(1)
    @Test
    public void testBasicUsage() {
        DependencyManager manager = new DependencyManager(EXECUTE_DIR);
        manager.addDependency(new StandardDependency("dev.vankka.dependencydownload", "common", "1.1.4", "", "4859108fa4501791f0261e8a9ecda10ad669dbf248e46df4473edeebf6b9c464", "SHA-256"));
        manager.addDependency(new StandardDependency("dev.vankka.dependencydownload", "runtime", "1.1.4", "", "d6f83a434aefcde6877941ccf6fd6bee839b3135eb56af107147a6e43d6883d2", "SHA-256"));

        Executor executor = Executors.newCachedThreadPool();

        manager.downloadAll(executor, Collections.singletonList(new StandardRepository("https://repo.maven.apache.org/maven2"))).join();
    }

    @Order(2)
    @Test
    public void testWithJson() {
        DependencyManager manager = new DependencyManager(EXECUTE_DIR);
        manager.loadFromResource(json);
        Executor executor = Executors.newCachedThreadPool();

        manager.downloadAll(executor, Collections.singletonList(new StandardRepository("https://repo.maven.apache.org/maven2"))).join();

    }

    @Order(3)
    @Test
    public void testWithCustomPath() {
        DependencyManager manager = new DependencyManager((dependency, relocated) -> {
            String dir_result = dependency.getGroupId().replace(".", "/") + "/" + dependency.getArtifactId() +
                    "/" + dependency.getVersion() + "/" + dependency.getFileName();
            if (relocated)
                return EXECUTE_DIR.resolve("relocated").resolve(dir_result);
            return EXECUTE_DIR.resolve(dir_result);
        });
        manager.loadFromResource(json);
        Executor executor = Executors.newCachedThreadPool();

        manager.downloadAll(executor, Collections.singletonList(new StandardRepository("https://repo.maven.apache.org/maven2"))).join();
    }

}*/
