/*
 * Copyright 2013 Carl Worley.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.kf5bau.orchesshtra.ssh.commands

/**
 *
 * @author Carl Worley <developer@kf5bau.net>
 */
class TerminalCommandFactory {
  private def commands = [ ]

  TerminalCommandFactory(String commandType) {
    String packageName = "net.kf5bau.orchesshtra.ssh.commands.${ commandType }"
    String path = "net/kf5bau/orchesshtra/ssh/commands/${ commandType }/"

    ClassLoader classLoader = Thread.currentThread().getContextClassLoader()
    URL resource = classLoader.getResource(path)
    File directory = new File(resource.file)

    // look only for class files that don't have dollar signs in the name
    directory.eachFileMatch(~/^((?!\$).)*$/) {
      // remove .class extension and prefix with package name
      Class clazz = Class.forName("${ packageName }.${ it.name[0..-7] }")
      commands << clazz.newInstance()
    }
  }

  TerminalCommand getCommand(String command, def parameters) {
    commands.find { it.isCommand(command, parameters) }
  }
}
