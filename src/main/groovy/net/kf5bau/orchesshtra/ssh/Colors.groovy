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

package net.kf5bau.orchesshtra.ssh

import java.awt.Color

/**
 * This class maps terminal color ordinals to Java AWT colors.
 * 
 * @author Carl Worley <developer@kf5bau.net>
 */
enum Colors {
  BLACK(0, 0, 0),
  BLUE(0, 0, 170),
  GREEN(0, 170, 0),
  CYAN(0, 170, 170),
  RED(170, 0, 0),
  MAGENTA(170, 0, 170),
  BROWN(170, 85, 0),
  WHITE(170, 170, 170),
  GREY(85, 85, 85),
  LIGHT_BLUE(85, 85, 255),
  LIGHT_GREEN(85, 255, 85),
  LIGHT_CYAN(85, 255, 255),
  LIGHT_RED(255, 85, 85),
  LIGHT_MAGENTA(255, 85, 255),
  YELLOW(255, 255, 85),
  LIGHT_WHITE(255, 255, 255)
  
  final Color color
  Colors(red, green, blue) { color = new Color(red, green, blue) }
}
