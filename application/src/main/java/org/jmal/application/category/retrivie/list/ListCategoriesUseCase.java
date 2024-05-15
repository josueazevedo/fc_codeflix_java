package org.jmal.application.category.retrivie.list;

import org.jmal.application.UseCase;
import org.jmal.domain.category.CategorySearchQuery;
import org.jmal.domain.pagination.Pagination;

public abstract class ListCategoriesUseCase
        extends UseCase<CategorySearchQuery, Pagination<CategoryListOutput>> {
}