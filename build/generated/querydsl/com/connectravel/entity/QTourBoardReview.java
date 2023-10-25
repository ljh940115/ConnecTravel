package com.connectravel.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QTourBoardReview is a Querydsl query type for TourBoardReview
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QTourBoardReview extends EntityPathBase<TourBoardReview> {

    private static final long serialVersionUID = 1082976024L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QTourBoardReview tourBoardReview = new QTourBoardReview("tourBoardReview");

    public final QBaseEntity _super = new QBaseEntity(this);

    public final StringPath content = createString("content");

    //inherited
    public final StringPath createdBy = _super.createdBy;

    public final NumberPath<Double> grade = createNumber("grade", Double.class);

    public final QMember member;

    //inherited
    public final StringPath modifiedBy = _super.modifiedBy;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> modTime = _super.modTime;

    public final NumberPath<Integer> recommend = createNumber("recommend", Integer.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> regTime = _super.regTime;

    public final NumberPath<Long> tbrno = createNumber("tbrno", Long.class);

    public final QTourBoard tourBoard;

    public QTourBoardReview(String variable) {
        this(TourBoardReview.class, forVariable(variable), INITS);
    }

    public QTourBoardReview(Path<? extends TourBoardReview> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QTourBoardReview(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QTourBoardReview(PathMetadata metadata, PathInits inits) {
        this(TourBoardReview.class, metadata, inits);
    }

    public QTourBoardReview(Class<? extends TourBoardReview> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.member = inits.isInitialized("member") ? new QMember(forProperty("member")) : null;
        this.tourBoard = inits.isInitialized("tourBoard") ? new QTourBoard(forProperty("tourBoard")) : null;
    }

}

