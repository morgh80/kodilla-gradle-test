package com.kodilla.testing.forum.statistics;

import java.util.HashMap;
import java.util.Map;

public class ForumStatistics {
    Statistics statistics;

    public ForumStatistics(Statistics statistics) {
        this.statistics = statistics;
    }

    private Integer usersStats = 0;
    private Integer postsStats = 0;
    private Integer commentStats = 0;
    private Integer averageUserPosts = 0;
    private Integer averageUserComments = 0;
    private Integer averagePostComments = 0;

    public HashMap<String, Integer> calculateAdvStatistics(Statistics statistics) {
        usersStats = statistics.usersNames().size();
        postsStats = statistics.postsCount();
        commentStats = statistics.commentsCount();
        if (postsStats != 0) {
            averageUserPosts = usersStats / postsStats;
        }
        if (commentStats != 0) {
            averageUserComments = usersStats / commentStats;
            averagePostComments = postsStats / commentStats;
        }

        HashMap<String, Integer> statsMap = new HashMap<>();
        statsMap.put("usersStats", usersStats);
        statsMap.put("postsStats", postsStats);
        statsMap.put("commentStats", commentStats);
        statsMap.put("averageUserPosts", averageUserPosts);
        statsMap.put("averageUserComments", averageUserComments);
        statsMap.put("averagePostComments", averagePostComments);

        return statsMap;
    }

    public void showStatistics() {
        System.out.println("Number of users: " + usersStats + ", Number of posts: " + postsStats + ", Number of comments: " + commentStats);
        System.out.println("Average number of posts per user " + averageUserPosts + ", Average number of comments per user " + averageUserComments + " Average number of comments per post: " + averagePostComments);
    }

}
