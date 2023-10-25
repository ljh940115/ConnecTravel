package com.connectravel.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QAdminBoardImg is a Querydsl query type for AdminBoardImg
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QAdminBoardImg extends EntityPathBase<AdminBoardImg> {

    private static final long serialVersionUID = -165269858L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QAdminBoardImg adminBoardImg = new QAdminBoardImg("adminBoardImg");

    public final QAdminBoard adminBoard;

    public final StringPath imgFile = createString("imgFile");

    public final NumberPath<Long> ino = createNumber("ino", Long.class);

    public QAdminBoardImg(String variable) {
        this(AdminBoardImg.class, forVariable(variable), INITS);
    }

    public QAdminBoardImg(Path<? extends AdminBoardImg> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QAdminBoardImg(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QAdminBoardImg(PathMetadata metadata, PathInits inits) {
        this(AdminBoardImg.class, metadata, inits);
    }

    public QAdminBoardImg(Class<? extends AdminBoardImg> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.adminBoard = inits.isInitialized("adminBoard") ? new QAdminBoard(forProperty("adminBoard"), inits.get("adminBoard")) : null;
    }

}

