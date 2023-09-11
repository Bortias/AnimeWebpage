package web.media.anime;

import web.media.BaseMediaType;
import web.structure.PersonEntity;
import web.structure.StudioEntity;

import java.util.UUID;

public class AnimeEntity extends BaseMediaType {
    private UUID uuid;

    private PersonEntity sourceAuthor;

    private PersonEntity director;

    private StudioEntity studio;

    private String description;

    //TODO: seasons, story arc, number of seasons?
}
