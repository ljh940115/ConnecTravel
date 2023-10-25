package com.connectravel.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QTourBoardReviewReply is a Querydsl query type for TourBoardReviewReply
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QTourBoardReviewReply extends EntityPathBase<TourBoardReviewReply> {

    private static final long serialVersionUID = -1810699598L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QTourBoardReviewReply tourBoardReviewReply = new QTourBoardReviewReply("tourBoardReviewReply");

    public final QBaseEntity _super = new QBaseEntity(this);

    //inherited
    public final StringPath createdBy = _super.createdBy;

    public final QMember member;

    //inherited
    public final StringPath modifiedBy = _super.modifiedBy;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> modTime = _super.modTime;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> regTime = _super.regTime;

    public final NumberPath<Long> tbrrno = createNumber("tbrrno", Long.class);

    public final StringPath text = createString("text");

    public final QTourBoardReview tourBoardReview;

    public QTourBoardReviewReply(String variable) {
        this(TourBoardReviewReply.class, forVariable(variable), INITS);
    }

    public QTourBoardReviewReply(Path<? extends TourBoardReviewReply> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QTourBoardReviewReply(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QTourBoardReviewReply(PathMetadata metadata, PathInits inits) {
        this(TourBoardReviewReply.class, metadata, inits);
    }

    public QTourBoardReviewReply(Class<? extends TourBoardReviewReply> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.member = inits.isInitialized("member") ? new QMember(forProperty("member")) : null;
        this.tourBoardReview = inits.isInitialized("tourBoardReview") ? new QTourBoardReview(forProperty("tourBoardReview"), inits.get("tourBoardReview")) : null;
    }

}

