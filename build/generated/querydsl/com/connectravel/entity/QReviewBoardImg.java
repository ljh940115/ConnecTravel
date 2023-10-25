package com.connectravel.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QReviewBoardImg is a Querydsl query type for ReviewBoardImg
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QReviewBoardImg extends EntityPathBase<ReviewBoardImg> {

    private static final long serialVersionUID = -1551703677L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QReviewBoardImg reviewBoardImg = new QReviewBoardImg("reviewBoardImg");

    public final StringPath imgFile = createString("imgFile");

    public final NumberPath<Long> ino = createNumber("ino", Long.class);

    public final QReviewBoard reviewBoard;

    public QReviewBoardImg(String variable) {
        this(ReviewBoardImg.class, forVariable(variable), INITS);
    }

    public QReviewBoardImg(Path<? extends ReviewBoardImg> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QReviewBoardImg(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QReviewBoardImg(PathMetadata metadata, PathInits inits) {
        this(ReviewBoardImg.class, metadata, inits);
    }

    public QReviewBoardImg(Class<? extends ReviewBoardImg> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.reviewBoard = inits.isInitialized("reviewBoard") ? new QReviewBoard(forProperty("reviewBoard"), inits.get("reviewBoard")) : null;
    }

}

