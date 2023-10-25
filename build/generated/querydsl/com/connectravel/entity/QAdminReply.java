package com.connectravel.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QAdminReply is a Querydsl query type for AdminReply
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QAdminReply extends EntityPathBase<AdminReply> {

    private static final long serialVersionUID = -1087115543L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QAdminReply adminReply = new QAdminReply("adminReply");

    public final QBaseEntity _super = new QBaseEntity(this);

    public final QAdminBoard adminBoard;

    //inherited
    public final StringPath createdBy = _super.createdBy;

    public final QMember member;

    //inherited
    public final StringPath modifiedBy = _super.modifiedBy;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> modTime = _super.modTime;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> regTime = _super.regTime;

    public final NumberPath<Long> rno = createNumber("rno", Long.class);

    public final StringPath text = createString("text");

    public QAdminReply(String variable) {
        this(AdminReply.class, forVariable(variable), INITS);
    }

    public QAdminReply(Path<? extends AdminReply> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QAdminReply(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QAdminReply(PathMetadata metadata, PathInits inits) {
        this(AdminReply.class, metadata, inits);
    }

    public QAdminReply(Class<? extends AdminReply> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.adminBoard = inits.isInitialized("adminBoard") ? new QAdminBoard(forProperty("adminBoard"), inits.get("adminBoard")) : null;
        this.member = inits.isInitialized("member") ? new QMember(forProperty("member")) : null;
    }

}

