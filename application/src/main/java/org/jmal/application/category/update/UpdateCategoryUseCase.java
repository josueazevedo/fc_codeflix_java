package org.jmal.application.category.update;

import io.vavr.control.Either;
import org.jmal.application.UseCase;
import org.jmal.domain.validation.handler.Notification;

public abstract class UpdateCategoryUseCase
        extends UseCase<UpdateCategoryCommand, Either<Notification, UpdateCategoryOutput>> {
}