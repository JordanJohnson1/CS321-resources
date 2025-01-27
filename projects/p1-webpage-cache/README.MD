# Project 1: Webpage Cache

* Author: Jordan Johnson
* Class: CS321 Section 002
* Semester: Spring 2025

## Overview

In this project I made an implementation of a cache by using a linked list.
Doing this we are trying to see if adding to a cache stays efficient as the number
of objects in the cache grows.

## Reflection

This lab was not super difficult conceptually but I faced a slew of issues.
Some of these issues have been resolved and some have not. The first issue was getting
a ClassNotFoundException for CacheExperiment.java. This was solved by compiling, easy fix!
The rest of my problems are seemingly unfixable.

I couldn't run ANY of the debug levels shown in the project 1 video.
I tried for hours to get JUnit to work on my IDE (vscode) and nothing worked even after following
the provided JUnit walkthrough. Compiling CacheTest wouldn't work either. The last problem I am facing is when running the test script. All of my tests say they fail although it becomes more efficient as the cache grows as shown in the examples.

## Compiling and Using

Compile: Enter "javac CacheExperiment.java" in terminal.
Run: Enter " ./run-tests.sh " in terminal.

No other user input needed.

## Results

Results showed that my tests are failing although the number of cache hits, references, hit percent,
and efficiency appear just like examples shown.

## Sources used

Project walkthrough google doc
project walkthrough video

