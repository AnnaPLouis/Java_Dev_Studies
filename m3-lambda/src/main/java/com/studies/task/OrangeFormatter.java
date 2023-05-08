package com.studies.task;

import com.studies.task.Orange;

@FunctionalInterface
public interface OrangeFormatter {
    String accept(Orange orange);
}
