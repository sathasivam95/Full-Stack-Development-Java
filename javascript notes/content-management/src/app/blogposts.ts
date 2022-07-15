export interface Post{
    id: number;
    title: string;
    userName: string;
    bodyOfPost: string;
    dateOfPost: string;
    dateOfExpiry: string;
    isExpired: boolean
    
}

export const post = [
    {
        id: 101,
        title: 'Welcome',
        userName: 'Tom',
        bodyOfPost: 'This is a body',
        dateOfPost: '02/10/2022',
        dateofExpiry: '02/12/2022',
        isExpired: false
    }
]