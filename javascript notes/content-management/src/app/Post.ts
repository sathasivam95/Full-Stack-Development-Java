export interface Post{
    id: number;
    title: string;
    userName: string;
    bodyOfPost: string;
    dateOfPost: Date;
    dateOfExpiry: Date;
    isExpired: boolean;
    // how does List<HashTag> looks like here?
}