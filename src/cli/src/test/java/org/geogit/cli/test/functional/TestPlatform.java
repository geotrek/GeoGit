/* Copyright (c) 2013 OpenPlans. All rights reserved.
 * This code is licensed under the BSD New License, available at the root
 * application directory.
 */
package org.geogit.cli.test.functional;

import java.io.File;

import org.geogit.api.DefaultPlatform;
import org.geogit.api.Platform;

public class TestPlatform extends DefaultPlatform implements Platform {

    private File userHomeDirectory;

    public TestPlatform(final File workingDirectory, final File userHomeDirectory) {
        this.userHomeDirectory = userHomeDirectory;
        super.setWorkingDir(workingDirectory);
    }

    @Override
    public File getUserHome() {
        return userHomeDirectory;
    }
}
