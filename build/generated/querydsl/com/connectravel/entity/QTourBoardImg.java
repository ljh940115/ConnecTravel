package com.connectravel.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QTourBoardImg is a Querydsl query type for TourBoardImg
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QTourBoardImg extends EntityPathBase<TourBoardImg> {

    private static final long serialVersionUID = -1353727997L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QTourBoardImg tourBoardImg = new QTourBoardImg("tourBoardImg");

    public final StringPath imgFile = createString("imgFile");

    public final NumberPath<Long> ino = createNumber("ino", Long.class);

    public final NumberPath<Integer> ord = createNumber("ord", Integer.class);

    public final QTourBoard tourBoard;

    public QTourBoardImg(String variable) {
        this(TourBoardImg.class, forVariable(variable), INITS);
    }

    public QTourBoardImg(Path<? extends TourBoardImg> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QTourBoardImg(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QTourBoardImg(PathMetadata metadata, PathInits inits) {
        this(TourBoardImg.class, metadata, inits);
    }

    public QTourBoardImg(Class<? extends TourBoardImg> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.tourBoard = inits.isInitialized("tourBoard") ? new QTourBoard(forProperty("tourBoard")) : null;
    }

}

