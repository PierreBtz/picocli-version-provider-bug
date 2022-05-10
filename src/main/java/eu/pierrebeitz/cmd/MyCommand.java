package eu.pierrebeitz.cmd;

import eu.pierrebeitz.provider.MyVersionProvider;
import eu.pierrebeitz.svc.VersionService;
import io.quarkus.logging.Log;
import io.quarkus.picocli.runtime.annotations.TopCommand;
import picocli.CommandLine.Command;

@TopCommand
@Command(
        name = "version",
        mixinStandardHelpOptions = true,
        versionProvider = MyVersionProvider.class
)
public class MyCommand implements Runnable {

    private final VersionService versionService;

    public MyCommand(VersionService versionService) {
        this.versionService = versionService;
    }

    @Override
    public void run() {
        Log.info(versionService.version());
    }

}
