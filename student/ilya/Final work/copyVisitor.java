package ru.au2019.java;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class copyVisitor extends SimpleFileVisitor {
    Folder parent;

    public copyVisitor(Folder parent) {
        this.parent = parent;
    }

    public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
        if (attrs.isDirectory()) {
            (new Manager()).createFolder(file.getFileName().toString(), parent);
        } else {
            (new Manager()).createFile(file.getFileName().toString(), parent, 0);
        };
        return FileVisitResult.CONTINUE;
    };
}
