package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;

import java.util.*;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class StatisticsTestSuite {

    @Test
    public void testCalculatePostsWhenEmpty() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.postsCount()).thenReturn(0);

        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);

        //When
        HashMap<String, Integer> resultMap = forumStatistics.calculateAdvStatistics(statisticsMock);
        int result = resultMap.get("postsStats");

        //Then
        Assert.assertEquals(0, result);
    }

    @Test
    public void testCalculatePosts() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.postsCount()).thenReturn(1000);

        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);

        //When
        HashMap<String, Integer> resultMap = forumStatistics.calculateAdvStatistics(statisticsMock);
        int result = resultMap.get("postsStats");

        //Then
        Assert.assertEquals(1000, result);
    }

    @Test
    public void testCalculateCommentsWhenEmpty() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.commentsCount()).thenReturn(1000);

        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);

        //When
        HashMap<String, Integer> resultMap = forumStatistics.calculateAdvStatistics(statisticsMock);
        int result = resultMap.get("commentStats");

        //Then
        Assert.assertEquals(1000, result);
    }

    @Test
    public void testCalculateComments() {
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.commentsCount()).thenReturn(0);

        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);

        //When
        HashMap<String, Integer> resultMap = forumStatistics.calculateAdvStatistics(statisticsMock);
        int result = resultMap.get("commentStats");

        //Then
        Assert.assertEquals(0, result);
    }

    @Test
    public void testCalculateAvgPostComments() {
        //Given
        List<String> userNames = new ArrayList<String>() {
            @Override
            public int size() {
                return 100;
            }
        };
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.usersNames()).thenReturn(userNames);
        when(statisticsMock.postsCount()).thenReturn(200);
        when(statisticsMock.commentsCount()).thenReturn(100);

        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);

        //When
        HashMap<String, Integer> resultMap = forumStatistics.calculateAdvStatistics(statisticsMock);
        int result = resultMap.get("averagePostComments");

        //Then
        Assert.assertEquals(2, result);
    }

    @Test
    public void testCalculateAvgUserPost() {
        //Given
        List<String> userNames = new ArrayList<String>() {
            @Override
            public int size() {
                return 100;
            }
        };
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.usersNames()).thenReturn(userNames);
        when(statisticsMock.postsCount()).thenReturn(10);
        when(statisticsMock.commentsCount()).thenReturn(0);

        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);

        //When
        HashMap<String, Integer> resultMap = forumStatistics.calculateAdvStatistics(statisticsMock);
        int result = resultMap.get("averageUserPosts");

        //Then
        Assert.assertEquals(10, result);
    }

    @Test
    public void testCalculateAvgUserComments() {
        //Given
        List<String> userNames = new ArrayList<String>() {
            @Override
            public int size() {
                return 100;
            }
        };
        Statistics statisticsMock = mock(Statistics.class);
        when(statisticsMock.usersNames()).thenReturn(userNames);
        when(statisticsMock.postsCount()).thenReturn(0);
        when(statisticsMock.commentsCount()).thenReturn(100);

        ForumStatistics forumStatistics = new ForumStatistics(statisticsMock);

        //When
        HashMap<String, Integer> resultMap = forumStatistics.calculateAdvStatistics(statisticsMock);
        int result = resultMap.get("averageUserComments");

        //Then
        Assert.assertEquals(1, result);
    }
}
