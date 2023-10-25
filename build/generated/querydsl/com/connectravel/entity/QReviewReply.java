package com.connectravel.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QReviewReply is a Querydsl query type for ReviewReply
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QReviewReply extends EntityPathBase<ReviewReply> {

    private static final long serialVersionUID = -1759138268L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QReviewReply reviewReply = new QReviewReply("reviewReply");

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

    public final QReviewBoard reviewBoard;

    public final NumberPath<Long> rrno = createNumber("rrno", Long.class);

    public final StringPath text = createString("text");

    public QReviewReply(String variable) {
        this(ReviewReply.class, forVariable(variable), INITS);
    }

    public QReviewReply(Path<? extends ReviewReply> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QReviewReply(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QReviewReply(PathMetadata metadata, PathInits inits) {
        this(ReviewReply.class, metadata, inits);
    }

    public QReviewReply(Class<? extends ReviewReply> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.member = inits.isInitialized("member") ? new QMember(forProperty("member")) : null;
        this.reviewBoard = inits.isInitialized("reviewBoard") ? new QReviewBoard(forProperty("reviewBoard"), inits.get("reviewBoard")) : null;
    }

}

