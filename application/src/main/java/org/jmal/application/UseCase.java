package org.jmal.application;

import org.jmal.domain.category.Category;

public abstract class UseCase<IN, OUT> {
    public abstract OUT execute(IN anIn);
}