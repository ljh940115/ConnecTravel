package com.connectravel.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QAdminBoard is a Querydsl query type for AdminBoard
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QAdminBoard extends EntityPathBase<AdminBoard> {

    private static final long serialVersionUID = -1101608219L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QAdminBoard adminBoard = new QAdminBoard("adminBoard");

    public final QBaseEntity _super = new QBaseEntity(this);

    public final NumberPath<Long> bno = createNumber("bno", Long.class);

    public final StringPath category = createString("category");

    public final StringPath content = createString("content");

    //inherited
    public final StringPath createdBy = _super.createdBy;

    public final QMember member;

    //inherited
    public final StringPath modifiedBy = _super.modifiedBy;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> modTime = _super.modTime;

    //inherited
    public final DateTimePath<java.time.LocalDateTime> regTime = _super.regTime;

    public final StringPath title = createString("title");

    public QAdminBoard(String variable) {
        this(AdminBoard.class, forVariable(variable), INITS);
    }

    public QAdminBoard(Path<? extends AdminBoard> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QAdminBoard(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QAdminBoard(PathMetadata metadata, PathInits inits) {
        this(AdminBoard.class, metadata, inits);
    }

    public QAdminBoard(Class<? extends AdminBoard> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.member = inits.isInitialized("member") ? new QMember(forProperty("member")) : null;
    }

}

