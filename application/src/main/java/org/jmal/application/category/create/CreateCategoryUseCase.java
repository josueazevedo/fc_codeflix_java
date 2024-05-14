package org.jmal.application.category.create;

import io.vavr.control.Either;
import org.jmal.application.UseCase;
import org.jmal.domain.validation.handler.Notification;

public abstract class CreateCategoryUseCase
        extends UseCase<CreateCategoryCommand, Either<Notification, CreateCategoryOutput>> {
}
