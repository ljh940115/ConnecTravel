package com.connectravel.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QRoomImg is a Querydsl query type for RoomImg
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QRoomImg extends EntityPathBase<RoomImg> {

    private static final long serialVersionUID = 1754366362L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QRoomImg roomImg = new QRoomImg("roomImg");

    public final StringPath imgFile = createString("imgFile");

    public final NumberPath<Long> ino = createNumber("ino", Long.class);

    public final QRoom room;

    public QRoomImg(String variable) {
        this(RoomImg.class, forVariable(variable), INITS);
    }

    public QRoomImg(Path<? extends RoomImg> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QRoomImg(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QRoomImg(PathMetadata metadata, PathInits inits) {
        this(RoomImg.class, metadata, inits);
    }

    public QRoomImg(Class<? extends RoomImg> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.room = inits.isInitialized("room") ? new QRoom(forProperty("room"), inits.get("room")) : null;
    }

}

