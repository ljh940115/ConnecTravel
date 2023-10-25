package com.connectravel.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QTourBoardReviewImg is a Querydsl query type for TourBoardReviewImg
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QTourBoardReviewImg extends EntityPathBase<TourBoardReviewImg> {

    private static final long serialVersionUID = -855522933L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QTourBoardReviewImg tourBoardReviewImg = new QTourBoardReviewImg("tourBoardReviewImg");

    public final StringPath imgFile = createString("imgFile");

    public final NumberPath<Long> ino = createNumber("ino", Long.class);

    public final QTourBoardReview tourBoardReview;

    public QTourBoardReviewImg(String variable) {
        this(TourBoardReviewImg.class, forVariable(variable), INITS);
    }

    public QTourBoardReviewImg(Path<? extends TourBoardReviewImg> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QTourBoardReviewImg(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QTourBoardReviewImg(PathMetadata metadata, PathInits inits) {
        this(TourBoardReviewImg.class, metadata, inits);
    }

    public QTourBoardReviewImg(Class<? extends TourBoardReviewImg> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.tourBoardReview = inits.isInitialized("tourBoardReview") ? new QTourBoardReview(forProperty("tourBoardReview"), inits.get("tourBoardReview")) : null;
    }

}

