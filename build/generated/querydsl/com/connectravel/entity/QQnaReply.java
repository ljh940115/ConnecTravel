package com.connectravel.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QQnaReply is a Querydsl query type for QnaReply
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QQnaReply extends EntityPathBase<QnaReply> {

    private static final long serialVersionUID = -209470220L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QQnaReply qnaReply = new QQnaReply("qnaReply");

    public final QBaseEntity _super = new QBaseEntity(this);

    //inherited
    public final StringPath createdBy = _super.createdBy;

    public final QMember member;

    //inherited
    public final StringPath modifiedBy = _super.modifiedBy;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> modTime = _super.modTime;

    public final QQnaBoard qnaBoard;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> regTime = _super.regTime;

    public final NumberPath<Long> rno = createNumber("rno", Long.class);

    public final StringPath text = createString("text");

    public QQnaReply(String variable) {
        this(QnaReply.class, forVariable(variable), INITS);
    }

    public QQnaReply(Path<? extends QnaReply> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QQnaReply(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QQnaReply(PathMetadata metadata, PathInits inits) {
        this(QnaReply.class, metadata, inits);
    }

    public QQnaReply(Class<? extends QnaReply> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.member = inits.isInitialized("member") ? new QMember(forProperty("member")) : null;
        this.qnaBoard = inits.isInitialized("qnaBoard") ? new QQnaBoard(forProperty("qnaBoard"), inits.get("qnaBoard")) : null;
    }

}

