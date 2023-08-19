/*
 * WorldEdit, a Minecraft world manipulation toolkit
 * Copyright (C) sk89q <http://www.sk89q.com>
 * Copyright (C) WorldEdit team and contributors
 *
 * This program is free software: you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as published by the
 * Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License
 * for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 */

package com.sk89q.worldedit.bukkit;

import com.sk89q.worldedit.util.TreeGenerator;
import org.junit.Assert;
import org.junit.Test;

public class BukkitWorldTest {

    @Test
    public void testTreeTypeMapping() {
        for (TreeGenerator.TreeType type : TreeGenerator.TreeType.values()) {
<<<<<<< HEAD
            Assert.assertFalse("Нет отображения для: " + type, BukkitWorld.toBukkitTreeType(type) == null);
=======
            Assert.assertNotNull("No mapping for: " + type, BukkitWorld.toBukkitTreeType(type));
>>>>>>> 5f4cc3e6940699b85c4ea9e37d61aba1423442d1
        }
    }

}
